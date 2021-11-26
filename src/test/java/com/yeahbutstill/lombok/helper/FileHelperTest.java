package com.yeahbutstill.lombok.helper;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileHelperTest {

    private static final Logger log = LoggerFactory.getLogger(FileHelperTest.class);

    @Test
    void testPom() throws Exception {

        String text = FileHelper.loadFile("pom.xml");
        log.info(text);

    }
}
