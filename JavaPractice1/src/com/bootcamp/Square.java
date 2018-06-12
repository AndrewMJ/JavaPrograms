package com.bootcamp;

import java.util.ArrayList;

public class Square {

    public static void main(String[] args) {
        Square();
    
    }

    public static void Square(){
        int [] scenario1 = {2, 4, 8};
        int [] scenario2 = {3, 9, 6};

        System.out.println(sList(scenario1));
        System.out.println(sList(scenario2));
    }

    static ArrayList<Integer>sList(int [] squareArray){
        ArrayList<Integer>squareNum = new ArrayList<Integer>();

        for (int i : squareArray){
            squareNum.add(i * i);
        }
        return squareNum;
    }
}
