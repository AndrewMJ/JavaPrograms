package com.bootcamp;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        System.out.println(lastLetter("today is friday"));
        System.out.println(reverseString("Welcome  to   HomeDepot..!com"));



//        System.out.println(palindrome("racecar"));
//        System.out.println(palindrome("balloon"));
//        System.out.println(palindrome("level"));

    }
//    public static String palindrome(String str) {
//        String str2 = "";
//        int length = str.length();
//        for (int i = length - 1; i >= 0; i--) {
//            str2 += str.charAt(i);
//        }
//        if (str.equals(str2)) {
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }
//        return "";
//    }

    public static String lastLetter(String str){

        //String stringArray [] = str1.split("");

        for(int i = 0; i < str.length(); i++){
            str = str.substring(str.length()-1);
            str.toUpperCase();
//            if(str.equals(" ")){
//                 str.toUpperCase();
//
//            }
            //str1 += str.charAt(i);
        }

        return str;
    }


    public static String reverseString(String s1) {
        StringBuilder noSpecialChar = new StringBuilder(s1.replaceAll("\\W", " "));
        StringTokenizer st = new StringTokenizer(noSpecialChar.toString());


        while(st.hasMoreElements()){
            String token = st.nextToken();
            StringBuilder sb = new StringBuilder(token);
            s1 = s1.replace(token, sb.reverse());
        }

       return s1;
    }

}
