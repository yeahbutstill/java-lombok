package com.yeahbutstill.lombok;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LoginTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    void testCreate() {

        //Gaya pembuatan Object menggunakan Statiac Method Lombok
        var login1 = Login.createEmpty();
        log.info(login1.getUsername());
        log.info(login1.getPassword());
        Assertions.assertNull(login1.getUsername());
        Assertions.assertNull(login1.getPassword());
        // Menggunakan Statiac Method Lombok
        var login2 = Login.create("dani", "sangatrahasia");
        log.info(login2.getUsername() + " " + login2.getPassword());
        Assertions.assertEquals("dani", login2.getUsername());
        Assertions.assertEquals("sangatrahasia", login2.getPassword());

    }

}
