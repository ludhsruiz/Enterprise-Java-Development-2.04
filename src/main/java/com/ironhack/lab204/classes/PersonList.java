package com.ironhack.lab204.classes;


import java.util.List;

public class PersonList {

    private List<Person> personList;


    public PersonList(List<Person> personList) {
        setPersonList(personList);
    }


    public Person findByName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        if (name.trim().split(" ").length != 2) {
            throw new IllegalArgumentException(" name format must be Name Surname");
        }
        for (Person person : this.personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }


    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
