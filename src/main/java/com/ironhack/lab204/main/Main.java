package com.ironhack.lab204.main;

import com.ironhack.lab204.classes.Person;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
            Person persona1 = new Person(3452343,"Elio", 30, "Piano Player");

            persona1.setAge(30);
            System.out.println(persona1.getAge());

            persona1.writePersonInformation(persona1);
            persona1.writePersonInformation(persona1);

    }
}

