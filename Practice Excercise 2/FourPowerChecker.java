package com.company;

public class FourPowerChecker {
    public static boolean fourPowerCheck(int number){
        if(number==1){
            return true;
        }

        while(java.lang.Math.abs(number) > 0 ){
            if(number ==4){
                return true;
            }
            number /= 4;
        }
        return false;
    }
}