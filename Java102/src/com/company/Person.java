package com.company;

public class Person{

    String name;

    String email;

    String phone;



//constructor

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public Person(String name, String email, String phone){//contructor

        this.name = name;

        this.email = email;

        this.phone = phone;

    }


    public void printGreeting(Person person){

        System.out.println("Hello "+ person.getName()+", im "+ name);

    }
    public void printEmail(){

        System.out.println(this.getEmail());

    }
    public void printPhone(){

        System.out.println(this.getPhone());

    }


}







