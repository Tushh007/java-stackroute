package com.company;

public class FactorialClass {
    public int getFactorial(int input){
        int factorial = 1;
        for(int i=2;i<=input;i++){
            factorial *= i;
        }
        return factorial;
    }
}