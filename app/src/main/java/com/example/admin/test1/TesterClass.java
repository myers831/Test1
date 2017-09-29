package com.example.admin.test1;

/**
 * Created by Admin on 9/29/2017.
 */

public class TesterClass {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome("rats live on no evil star");
        palindrome.test();

        Singleton.getInstance();


        int [] numbers = {2,3,4,5,5,6,7};
        FindDups findDups = new FindDups(numbers);
        findDups.find();

        Armstrong armstrong = new Armstrong("153");
        armstrong.findArm();
    }
}
