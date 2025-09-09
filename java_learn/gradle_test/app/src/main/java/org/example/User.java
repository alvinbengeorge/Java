package org.example;
import java.lang.Override;

public class User {
    public String name;
    public int age;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age;
    }
}
