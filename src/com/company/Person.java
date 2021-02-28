package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Person )) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                gender.equals(person.gender);
    }

    @Override
    public int hashCode() {
        int hash = firstName.hashCode() + lastName.hashCode() + gender.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + " Фамилия: " + lastName + " Пол: " + gender;

    }
}
