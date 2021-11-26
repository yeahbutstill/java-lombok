package com.yeahbutstill.lombok.model;

import lombok.var;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

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
                .hobbies(hobbies)
                .build();

    }
}
