package com.bootcamp;

import java.util.ArrayList;

public class EvenNumbers {

    public static void main(String[] args) {
        evenNumbers();

    }

    public static void evenNumbers() {
        int[] scenario1 = {1, -8, 4, -3, 6, 9};
        int[] scenario2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] scenario3 = {-1, -3, 5, 7, 9, -11};

        System.out.println(sList(scenario1));
        System.out.println(sList(scenario2));
        System.out.println(sList(scenario3));
    }

    static ArrayList<Integer>sList(int [] evenArray){
      ArrayList<Integer>evenNum = new ArrayList<Integer>();

      boolean even = true;

      for (int i : evenArray){
          if (i%2 !=0){
              even = false;
          }
          if (even){
              evenNum.add(i);
          }
          even = true;
      }

      return evenNum;



    }
}
