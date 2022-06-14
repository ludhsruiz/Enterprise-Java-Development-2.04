package com.ironhack.lab204.classes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {

    private static PersonList personObject;
    private static List<Person> personList;

    @BeforeAll
    public static void setUp() {
        System.out.println("Testing PersonList");
        personList = new ArrayList<>();
        personList.add(new Person(123, "Clemenza", 23, "killer"));
        personList.add(new Person(2345, "Don Corleone", 26, "goodfather"));
        personList.add(new Person(2345, "Matthew", 20, "producer"));

        personObject = new PersonList(personList);
    }

    @Test
    void findByName_emptyOrNull_IllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> {personObject.findByName("");});
    }
    @Test
    void findByName_namePresent_getperson(){
        assertEquals(personList.get(0), personObject.findByName("Marco"));
    }
    @Test
    void findByName_nameNotPresent_Null(){
        assertEquals(null, personObject.findByName("Antonio"));
    }
    @Test
    void findByName_notLastname_Null(){
        assertThrows(IllegalArgumentException.class, () -> {personObject.findByName("Sabrina");});
    }
}