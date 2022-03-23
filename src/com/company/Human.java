package com.company;

import java.util.Date;

public class Human {
    private String dateOfBirth;
    private String name = "Default Name";

    public Human(String dateOfBirth, String name) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello World");
    }


    public void setName(String name){
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void printDetails(){
        System.out.println("Name -->"+ this.name);
        System.out.println("DOB  -->"+ this.dateOfBirth);
    }
}
