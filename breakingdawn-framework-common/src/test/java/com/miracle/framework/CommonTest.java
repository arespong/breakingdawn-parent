package com.miracle.framework;

import com.miracle.framework.utils.RsaUtils;
import org.junit.Test;

public class CommonTest {
    @Test
    public void testRsaCreate() throws Exception {
        RsaUtils.generateKey("D:\\temp\\id_key_rsa.public","D:\\temp\\id_key_rsa","ponter",1024);
    }
}
