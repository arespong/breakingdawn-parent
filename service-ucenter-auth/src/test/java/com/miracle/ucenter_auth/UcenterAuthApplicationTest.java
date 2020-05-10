package com.miracle.ucenter_auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UcenterAuthApplicationTest {
    @Autowired
    BCryptPasswordEncoder cryptPasswordEncoder;

    @Test
    public void testecode(){
        String ponter = cryptPasswordEncoder.encode("ponter");
        System.out.println(ponter);

    }
}
