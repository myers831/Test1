package com.example.admin.test1;

/**
 * Created by Admin on 9/29/2017.
 */

public class FindDups {

    int [] intagers;
    int num, tempCount, finalCount;

    public FindDups(int[] intagers) {
        this.intagers = intagers;
    }

    public void find(){

        for(int i = 0; i < intagers.length; i++){
            for (int j = 0; j < intagers.length; j++){
                if(intagers[i] == intagers[j]){
                    tempCount++;
                    if(tempCount > finalCount){
                        finalCount = tempCount;
                        tempCount = 0;
                        num = intagers[i];
                    }
                }
            }
        }
        System.out.println("the number " +num+ " appeared " +(finalCount - 1)+ " times which is the most of any number in the array");
    }

}
