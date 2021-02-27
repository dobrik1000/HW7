package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Nick", "Dobrinskiy", Gender.MALE);
        Person p2 = new Person("Maya", "Likhberg", Gender.FEMALE);
        Person p3 = new Person("Roman", "Belskiy", Gender.MALE);
        Person p4 = new Person("Nick", "Dobrinskiy", Gender.MALE);
        Person p5 = new Person("Maya", "Likhberg", Gender.FEMALE);

        Set<Person> Person = new HashSet<>();
        Person.add(p1);
        Person.add(p2);
        Person.add(p3);
        Person.add(p4);
        Person.add(p5);

        for (Object o : Person) {
            System.out.println(o);
        }

        System.out.println("Всего уникальных элемента в коллекции: " + Person.size());

    }
}
