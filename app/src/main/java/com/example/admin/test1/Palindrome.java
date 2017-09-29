package com.example.admin.test1;

/**
 * Created by Admin on 9/29/2017.
 */

public class Palindrome {
    public String text;

    public Palindrome(String text) {
        this.text = text;
    }

    public boolean test(){

        for(int i = 0; i< text.length(); i++){
            if(text.charAt(i) != text.charAt((text.length()-1)-i)){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}
