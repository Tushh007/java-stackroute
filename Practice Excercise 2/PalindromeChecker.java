package com.company;

public class PalindromeChecker {
    public static boolean palindromeCheck(String input){

        StringBuffer buffer = new StringBuffer(input);
        String palindrome = buffer.reverse().toString();

        if(palindrome.equals(input)){
            return true;
        }

        return false;
    }
}