package com.yeahbutstill.lombok.model;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterTest {

    private static final Logger log = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    void testWith() {

        var register1 = new Register("dani", "sangatrahasia");
        var register2 = register1.withUsername("maya");

        Assertions.assertEquals(register1.getPassword(), register2.getPassword());
        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());
        log.info(String.valueOf(register1));
        log.info(String.valueOf(register2));

    }
}
