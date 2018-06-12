package com.bootcamp;

public class Main {

    public static void main(String[] args) {

        PathFinder aPath = new PathFinder();
        long myPath = aPath.CalculatePaths(16, 16);
        System.out.println(myPath);

    }


}
