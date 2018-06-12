package com.bootcamp;

import java.util.ArrayList;

public class Cube {



    public static void Cube(){
        int [] scenario1 = {2, 4, 8};
        int [] scenario2 = {3, 9, 6};

        System.out.println(sList(scenario1));
        System.out.println(sList(scenario2));
    }

    static ArrayList<Integer>sList(int [] cubeArray){
        ArrayList<Integer>cubeNum = new ArrayList<Integer>();

        for(int i : cubeArray){
            cubeNum.add(i * i * i);
        }
        return cubeNum;

    }
}
