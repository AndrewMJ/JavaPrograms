package com.bootcamp;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse());


    }

    static String reverse(){
        String str = "Thursday is here";
        String str2 = "";

        for (int i = str.length()-1; i >= 0; i--){
           str2 += str.charAt(i);
        }
        return str2;
    }
}
