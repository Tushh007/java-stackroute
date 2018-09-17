package com.company;

import java.util.Arrays;

public class GradeAnalyser{

    int n;
    int grades[];

    public GradeAnalyser(int n, int grades[]){

        this.n = n;
        this.grades = grades;

    }

    public int average(){

        int arraySum = 0;
        for(int i=0;i<n;i++){
            arraySum += grades[i];
        }
        return arraySum/n;
    }

    public int minimum(){

        Arrays.sort(grades);
        return grades[0];

    }

    public int maximum(){

        Arrays.sort(grades);
        return grades[n-1];

    }

}