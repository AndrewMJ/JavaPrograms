package com.bootcamp;

import java.util.ArrayList;

public class PositiveNumbers {

  public static void main(String[] args) {
    positiveNumbers();

  }

  public static void positiveNumbers(){

    int [] scenario1 = {1, -3, 5, -3, 0};
    int [] scenario2 = {1, 2, 3};
    int [] scenario3 = {-1, -2, -3};

    ArrayList result1 = new ArrayList<Integer>();
    ArrayList result2 = new ArrayList<Integer>();
    ArrayList result3 = new ArrayList<Integer>();

    for(int i = 0; i < scenario1.length; i++){
      if (scenario1[i] >= 0){
        result1.add(scenario1[i]);
      }
    }

    for(int i = 0; i < scenario2.length; i++){
      if (scenario2[i] >= 0){
        result2.add(scenario2[i]);
      }
    }

    for(int i = 0; i < scenario3.length; i++){
      if (scenario3[i] >= 0){
        result3.add(scenario3[i]);
      }
    }

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);



  }

}
