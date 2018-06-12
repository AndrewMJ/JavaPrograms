package com.company;

public class CollectionSum {
    int [] numbers = {12, 23, 34, 45 ,56 ,67, 78 , 89};

    public static int sumOfArray(int [] numbers){

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

}
