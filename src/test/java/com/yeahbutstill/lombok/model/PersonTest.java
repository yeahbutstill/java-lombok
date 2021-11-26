package com.yeahbutstill.lombok.model;

import lombok.var;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

class PersonTest {

    private static final Logger log = LoggerFactory.getLogger(PersonTest.class);

    @Test
    void testCreateViaConstructor() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Geme");
        hobbies.add("Berenang");
        hobbies.add("Ngoding");
        hobbies.add("Sepakbola");
        hobbies.add("Stage Dive");

        var person = new Person("id", "name", 28, hobbies);


    }

    @Test
    void testCreateViaSetter() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Geme");
        hobbies.add("Berenang");
        hobbies.add("Ngoding");
        hobbies.add("Sepakbola");
        hobbies.add("Stage Dive");

        var person = new Person();
        person.setId("id");
        person.setName("name");
        person.setAge(28);
        person.setHobbies(hobbies);

    }

    @Test
    void testCreateViaBuilder() {

        // Manual Collection
        var hobbies = new ArrayList<String>();
        hobbies.add("Geme");
        hobbies.add("Berenang");
        hobbies.add("Ngoding");
        hobbies.add("Sepakbola");
        hobbies.add("Stage Dive");

        var person = Person.builder()
                .id("id")
                .name("name")
                .age(28)
                // Jamak
                .hobbies(hobbies)
                .build();

    }

    @Test
    void testCreateViaBuilderWithSingular() {

        var person = Person.builder()
                .id("id")
                .name("name")
                .age(28)
                .hobby("Game")
                .hobby("Stage Dive")
                .hobby("Ngoding")
                .build();

        log.info(String.valueOf(person));
    }

}
