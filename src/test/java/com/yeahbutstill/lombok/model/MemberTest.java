package com.yeahbutstill.lombok.model;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberTest {

    private static final Logger log = LoggerFactory.getLogger(MemberTest.class);

    @Test
    void testConstructorNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member(null, null);
            log.info(String.valueOf(member));
        });

    }

    @Test
    void testSetterNull() {
        var member = new Member("1", "Dani");
        member.setId(null);
        member.setName(null);
        log.info(String.valueOf(member));
    }
}
