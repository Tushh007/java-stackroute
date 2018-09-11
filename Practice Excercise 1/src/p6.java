package com.company;
import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {
        System.out.println("Enter the input:") ;
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        if (Character.isUpperCase(c)) {
            System.out.println("A capital letter");
        }

        else if (Character.isLowerCase(c)) {
            System.out.println("A lower letter");
        }

        else if (Character.isDigit(c)) {
            System.out.println("A digit");
        }

        else{
            System.out.println("A special character");
        }


    }
}
