package com.bootcamp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //oddNumbers();
       magic(3);

    }

//    public static void oddNumbers(){
//        int [] scenario1 = {1, -8, 4, -3, 6, 9};
//        int [] scenario2 = {1, 2, 3, 4, 5, 6 ,7, 8};
//        int [] scenario3 = {-1, -3, 5, 7, 9, -11};
//
//        System.out.println(sList(scenario1));
//        System.out.println(sList(scenario2));
//        System.out.println(sList(scenario3));
//
//    }
//
//    static ArrayList<Integer>sList(int [] oddArray){
//        ArrayList<Integer>oddNum = new ArrayList<Integer>();
//
//
//
//        for(int i : oddArray){
//            if(i%2 != 0){
//                oddNum.add(i);
//            }
//        }
//        return oddNum;
//
//    }
public static int magic(int num) {

    int total = 0;

    for(int i = 1 ; i <= num ; i++) {

        total += i*2;

    }

    return total;

}

}
