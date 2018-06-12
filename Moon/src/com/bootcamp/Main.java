package com.bootcamp;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        int x =numberOfBlueMoons(2000,0,1,0,0,2999);
        System.out.println(x);
    }

    public static int numberOfBlueMoons(int startYear, int startMonth, int startDate, int startHour, int startMinute,
                                        int endOfYear){
        int blueMoonCount = 0;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(startYear,startMonth,startDate,startHour,startMinute);

        while(calendar.get(GregorianCalendar.YEAR)<=endOfYear){
            int preMonth = calendar.get(GregorianCalendar.MONTH);
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 29);
            calendar.add(GregorianCalendar.HOUR,12);
            calendar.add(GregorianCalendar.MINUTE,44);

            if(preMonth == calendar.get(GregorianCalendar.MONTH)){
                blueMoonCount++;
            }
        }

       // System.out.println(calendar.get(GregorianCalendar.DAY_OF_YEAR));
        return blueMoonCount;

    }

}
