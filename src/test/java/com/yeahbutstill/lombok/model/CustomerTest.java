package com.yeahbutstill.lombok.model;

import lombok.var;
import org.junit.jupiter.api.Assertions;
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

    @Test
    void testCustomerConstructor() {

        var customer = new Customer("ID", "NAME");
        Assertions.assertEquals("ID", customer.getId());
        Assertions.assertEquals("NAME", customer.getName());

    }

    @Test
    void testEquals() {

        var customer1 = new Customer("ID1", "dani");
        var customer2 = new Customer("ID1", "dani");
        Assertions.assertEquals(customer1, customer2);
        Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());

    }

    @Test
    void testExclude() {

        var customer1 = new Customer("ID1", "dani");
        var customer2 = new Customer("ID1", "maya");
        Assertions.assertEquals(customer1, customer2);
        Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());

    }
}
