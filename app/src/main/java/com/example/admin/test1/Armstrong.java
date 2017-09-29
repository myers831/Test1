package com.example.admin.test1;

import java.util.ArrayList;

/**
 * Created by Admin on 9/29/2017.
 */

public class Armstrong {


    String armNum;
    int finalArmNum;

    public Armstrong(String armNum) {
        this.armNum = armNum;

    }

    public void findArm(){
        int [] armArray = new int[armNum.length()];
        for(int i = 0; i < armNum.length(); i++){
            armArray[i] = Character.getNumericValue((int) armNum.charAt(i));
        }

        for(int i = 0; i < armArray.length; i++){
            finalArmNum += Math.pow(armArray[i], 3);
        }

        if(finalArmNum == Integer.parseInt(armNum)){
            System.out.println("Is a Armstrong number " +finalArmNum);
        }else{
            System.out.println("Is not a Armstrong number "+finalArmNum);
        }

    }
}
