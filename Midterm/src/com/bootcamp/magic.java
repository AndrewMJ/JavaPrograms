package com.bootcamp;

public class magic {

    public static void main(String[] args) {
        System.out.println(magic(3));


    }
    public static int magic(int num) {

        int total = 0;

        for(int i = 1 ; i <= num ; i++) {

            total += i*2;

        }

        return total;

    }

}
