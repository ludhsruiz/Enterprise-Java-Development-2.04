package com.ironhack.lab204.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;
    private String occupation;


    public Person(int id, String name, int age, String occupation) {
        setId(id);
        setName(name);
        setAge(age);
        setOccupation(occupation);
    }


    public Person clone(Person chosenPerson) {
        Person clone = new Person(chosenPerson.getId() + 1, chosenPerson.getName(),
                chosenPerson.getAge(), chosenPerson.getOccupation());
        return clone;
    }

    public static void writePersonInformation(Person person) throws IOException {
        FileWriter writer = new FileWriter("demo.txt", true);
        writer.write(person.toString());
        writer.close();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new NullPointerException("age cannot be null or empty");
        } else {
            this.age = age;
        }
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName()) && getOccupation().equals(person.getOccupation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getOccupation());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}' + "\n";
    }
}