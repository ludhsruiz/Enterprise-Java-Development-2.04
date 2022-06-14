package com.ironhack.lab204.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person1;
    private Person person2;

    @BeforeEach
    public void setUp() {
        person1 = new Person(3,"Marta", 20, "Outsider");
        person2 = new Person(3,"Ana", 24, "Lawyer");
    }
    @Test
    void setAge_ageBelowZero_NullPointerException() {
        assertThrows(NullPointerException.class, () -> person1.setAge(-2));
    }
    @Test
    void setAge_ageCorrect_setAge() {
        person1.setAge(30);
        assertEquals(30, person1.getAge());
    }

    @Test
    void testClone_clonedPersonId_IdPlusOne() {
        assertEquals(4, person1.clone(person1).getId());
    }
    @Test
    void testClone_equalPersons_true() {
        assertEquals(true, person1.equals(person1.clone(person1)));
    }
    @Test
    void testClone_notEqualPersons_false() {
        assertEquals(false, person1.equals(person1.clone(person2)));
    }
}