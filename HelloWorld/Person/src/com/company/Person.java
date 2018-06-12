package com.company;

public class Person {

    static String category = "Person";

    private String name;
    private int age;
    private double height;
    private double weight;

    private Person() {}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {return age;}

    public void setAge (int age) {this.age = age;}
}
