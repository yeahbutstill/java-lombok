package com.yeahbutstill.lombok.model;

import lombok.var;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CustomerTest {

    private static final Logger log = LoggerFactory.getLogger(CustomerTest.class);

    @Test
    void testCustomer() {

        var customer = new Customer();
        customer.setId("100");
        customer.setName("Dani");

        log.info(customer.getId());
        log.info(customer.getName());

    }
}
