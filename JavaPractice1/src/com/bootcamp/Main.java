package com.bootcamp;

public class Main {

    public static void main(String[] args) {
        addingArray();
        multiplyingArray();
        factorial();
        System.out.print(factorial2());


    }

    public static void addingArray() {
        int array[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }
        System.out.println("The sum is : " + sum);
    }

    public static void multiplyingArray() {
        int array[] = {3, 4, 5};
        int product = 1;

        for (int i = 0; i < array.length; i++) {

            product *= array[i];
        }
        System.out.println("The product is : " + product);
    }

    public static void factorial() {
        int num = 10;
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("The factorial of " + num + " is " + result);
    }

    public static int factorial2() {
        int num = 10;
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }


}