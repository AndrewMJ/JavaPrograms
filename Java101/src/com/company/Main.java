package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 5;

        if(x==0){
            System.out.printf("Sunday");
        }
        else if(x==1){
            System.out.printf("Monday");
        }
        else if(x==2){
            System.out.printf("Tuesday");
        }
        else if(x==3){
            System.out.printf("Wednesday");
        }
        else if(x==4){
            System.out.printf("Thursday");
        }
        else if(x==5){
            System.out.printf("Friday");
        }
        else if(x==7){
            System.out.printf("Saturday");
        }
        else{
            System.out.println("Error");
        }
    }
}
