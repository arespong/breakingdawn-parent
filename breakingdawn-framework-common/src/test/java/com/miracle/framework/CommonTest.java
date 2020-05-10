package com.miracle.framework;

import com.miracle.framework.utils.JwtUtils;
import com.miracle.framework.utils.LoginUser;
import com.miracle.framework.utils.Payload;
import com.miracle.framework.utils.RsaUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.nio.charset.Charset;
import java.security.PrivateKey;
import java.security.PublicKey;

public class CommonTest {
    @Test
    public void testRsaCreate() throws Exception {
        RsaUtils.generateKey("D:\\temp\\id_key_rsa.public", "D:\\temp\\id_key_rsa", "ponter", 1024);
    }

    @Test
    public void testReadPublicKey() throws Exception {
        PublicKey publicKey = RsaUtils.getPublicKey("D:\\temp\\id_key_rsa.public");
        System.out.println(publicKey);
    }

    @Test
    public void testReadPrivateKey() throws Exception {
        PrivateKey privateKey = RsaUtils.getPrivateKey("D:\\temp\\id_key_rsa");
        System.out.println(privateKey);
    }

    @Test
    public void testCreateAndParseJwtToken() throws Exception {
        String jwtToken = JwtUtils.generateTokenExpireInSeconds(new LoginUser("Allen", 28), RsaUtils.getPrivateKey("D:\\temp\\id_key_rsa"), 5000);
        System.out.println(jwtToken);
        String str = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidW5pdHktcmVzb3VyY2UiLCJtb2JpbGUtXHJcbnJlc291cmNlIl0sInVzZXJfbmFtZSI6ImFsbGVuIiwic2NvcGUiOlsiYXBwIl0sImV4cCI6MTU4ODMxMzQyNywiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiJdLCJqdGkiOiI5MGUxN2E3ZC1mOGI1LTRiMDUtYmU4Ni0wYWQ2M2M0ZDNiYTkiLCJjbGllbnRfaWQiOiJwb250ZXIifQ.vImMVpROkxOWYzoL_7-5Py5BM1-5-Hrr7Whq0bAV8l8";
        Payload<LoginUser> payload = JwtUtils.getInfoFromToken(str, RsaUtils.getPublicKey("D:\\temp\\id_key_rsa.public"), LoginUser.class);
        System.out.println(payload.getUserInfo());

    }



}
