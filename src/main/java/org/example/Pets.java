package org.example;

public class Pets {

    private String name;
    private double weight;
    private byte age;


    public Pets(String name, double weight, byte age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}


