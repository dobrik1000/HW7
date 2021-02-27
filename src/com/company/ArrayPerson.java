package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Nick", "Dobrinskiy", Gender.MALE);
        Person p2 = new Person("Maya", "Likhberg", Gender.FEMALE);
        Person p3 = new Person("Roman", "Belskiy", Gender.MALE);
        Person p4 = new Person("Sergey", "Perekyp", Gender.MALE);
        Person p5 = new Person("Nastya", "Reshilova", Gender.FEMALE);

        java.util.ArrayList<Person> Person = new java.util.ArrayList<>();

        Person.add(0, p1);
        Person.add(1, p2);
        Person.add(2, p3);
        Person.add(3, p4);
        Person.add(4, p5);

        for( int i = 0; i < Person.size(); i++){
            System.out.println(Person.get(i));
        }

        System.out.println("Элементов в коллекции: " + Person.size());


    }

}