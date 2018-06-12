package com.bootcamp;

public class PathFinder {

    private long finalCount = 0;

    public long CalculatePaths(int rowLength, int colLength){



       int rowArr[][]= new int[rowLength][colLength];

       for(int i = 0; i < rowArr.length; i++){
           for(int j = 0; j < rowArr[i].length; j++){
               System.out.print(rowArr[i][j] + " ");
           }

           System.out.println();
       }
       moving(0,0, rowLength, colLength);


        return finalCount;
    }

    public void moving(int currentX, int currentY, int maxRowLength, int maxColLength){
        //can I move right
        //System.out.println("[" + currentX +"]" + "[" + currentY +"]");
        if(currentY < maxRowLength){
            moving(currentX,currentY + 1, maxRowLength, maxColLength);
            //System.out.print("[" + currentX +"]" + "[" + currentY +"]");
        }
        if(currentX < maxColLength){
            moving(currentX + 1, currentY, maxRowLength, maxColLength);
           // System.out.print("[" + currentX +"]" + "[" + currentY +"]");
        }
        if(currentY >= maxRowLength && currentX >= maxColLength){
            finalCount++;
        }


    }
}