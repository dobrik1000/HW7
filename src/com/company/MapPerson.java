package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Nick", "Dobrinskiy", Gender.MALE);
        Person p2 = new Person("Maya", "Likhberg", Gender.FEMALE);
        Person p3 = new Person("Roman", "Belskiy", Gender.MALE);
        Person p4 = new Person("Sergey", "Perekyp", Gender.MALE);
        Person p5 = new Person("Nastya", "Reshilova", Gender.FEMALE);

        Map<Integer, Person> Person = new HashMap<>();
        Person.put(1, p1);
        Person.put(2, p2);
        Person.put(3, p3);
        Person.put(4, p4);
        Person.put(5, p5);

        Set set = Person.entrySet();
        for(Object o: Person.entrySet()){
            System.out.println(o);
        }
        System.out.println("Элементов в массиве: " + Person.size());


    }
}
