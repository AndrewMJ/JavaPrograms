package com.bootcamp;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while(count !=6){
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count !=6);
        System.out.println("***********************************");

        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("***********************************");
        int number2 = 4;
        int finishNumber2= 20;
        int evenNumbersFound2 = 0;
        while(number2 <= finishNumber2){
            number2++;
            if(!isEvenNumber(number2)){
                continue;
            }
            System.out.println("Even number " + number2);

            evenNumbersFound2++;
            if (evenNumbersFound2 >=5){
                break;
            }


        }
        System.out.println("Total number of even number is: " + evenNumbersFound2);
    }
    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}
