package com.bootcamp;

import java.util.HashMap;
import java.util.Map;

public class LetterSummary {

    public static void main(String[] args) {
        System.out.println(letter_histogram());


    }

    public static Map letter_histogram(){

        String str = "banana";
        Map<Character,Integer>total = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++){
            if(total.containsKey(str.charAt(i))){
                total.replace(str.charAt(i), total.get(str.charAt(i)) + 1);
            }
            else{
                total.put(str.charAt(i), 1);
            }

        }
        return total;


    }
}
