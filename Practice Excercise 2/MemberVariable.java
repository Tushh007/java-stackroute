package com.company;
import com.company.Member;

public class MemberVariable extends Member {
    public MemberVariable(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public int getSalary(){

        return salary;
    }

}