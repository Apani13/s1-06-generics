package level01.exercise1and2.model;

import java.util.Objects;

public class Person {
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age) {
        this.name = validateName(name, "name");
        this.surName = validateName(surName, "surName");
        this.age = validateAge(age);
    }

    private String validateName(String value, String field) {
        Objects.requireNonNull(value, field + " must not be null");
        if (value.isBlank()) {
            throw new IllegalArgumentException(field + " must not blank");
        }
        return value;
    }

    private int validateAge(int age) {
        if (age < 0) throw new IllegalArgumentException("age must me greater than 0");
        return age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = validateName(name,"name");
    }

    public void setSurName(String surName) {
        this.surName = validateName(surName,"surName");
    }

    public void setAge(int age) {
        this.age = validateAge(age);
    }

    @Override
    public String toString() {
        return "PERSON"
                + "\nname = " + name
                + "\nsurName = " + surName
                + "\nage = " + age;
    }
}
