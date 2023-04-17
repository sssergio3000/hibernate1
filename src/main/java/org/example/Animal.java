package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    private long id;
    private String name;
    private int age;
    private boolean tail;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(long id, String name, int age, boolean tail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
