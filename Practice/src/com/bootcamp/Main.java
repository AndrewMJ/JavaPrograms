package com.bootcamp;

public class Main {

    public static void main(String[] args) {
        temperature();
        fizzBuzz();

    }

    public static void temperature() {
        //C to F
        int cToF = -5;

        double temperature = (cToF * 1.8) + 32;
        System.out.println("Temperature in C: " + cToF + "\n" + temperature + " F");
    }

        //Days of the Week

//        int x = 5;
//        if(x==0){
//            System.out.println("Sunday");
//        }
//        else if (x==1){
//            System.out.println("Monday");
//        }
//        else if(x==2){
//            System.out.println("Tuesday");
//        }
//        else if(x==3){
//            System.out.println("Wednesday");
//        }
//        else if(x==4){
//            System.out.println("Thursday");
//        }
//        else if(x==5){
//            System.out.println("Friday");
//        }
//        else if(x==6){
//            System.out.println("Saturday");
//        }
//        else{
//            System.out.println("Invalid number");
//        }



//        //Days of the week (Work)
//        int x = 5;
//        String message;
//        switch (x){
//            case 1:
//                message = "Go to work";
//            case 2:
//                message = "Go to work";
//            case 3:
//                message = "Go to work";
//            case 4:
//                message = "Go to work";
//            case 5:
//                message = "Go to work";
//                break;
//            case 6:
//                message = "Sleep in";
//            case 7:
//                message = "Sleep in";
//                break;
//            default:
//                message = "Invalid number";
//        }
//        System.out.println(message);



        // 1 to 10
//        int i = 1;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }



        //n to m
//        for(int i = 2; i <9; i++){
//            System.out.println(i);
//
//        }


        //Odd Numbers
//        int i = 1;
//        while(i<10){
//            System.out.println(i++);
//            i++;
//        }


        //Sum of numbers 1 to 100
//        int i = 0;
//        int sum = 0;
//            do{
//                i++;
//                sum += i;
//                // same thing as sum = sum + i;
//            }
//            while (i<100);
//
//        System.out.println(sum);


        //Hello Everyone
//        String[] people = {"Linda", "John", "Maya", "Nerine", "Gary"};
//        for (String name : people){
//            System.out.println("Hello there " + name + "!");
//        }

    public static void fizzBuzz() {
        //FizzBuzz
        for (int i = 1; i < 61; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }

    }

}
