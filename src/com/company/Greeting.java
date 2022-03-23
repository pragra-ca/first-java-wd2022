package com.company;

public class Greeting {
    // Start of Main Method
    public static void main(String[] args) {
        String greeting = generateGreeting("ES", "Akash");
        System.out.println(greeting);
        double interest = calculateInterest(10000, 12, 2.0);
        System.out.println(interest);

        double salary = calculateSalary(20, 15);


    }
    //End

    public boolean in1To10(int n, boolean outsideMode) {
        return false;
    }

    public static double calculateInterest(double principal, int time, double roi) {
        //calculateSalary()
        return principal*time*roi/100;
    }

    public static String generateGreeting(String lang, String name){
        if( lang == "EN") {
            return  "Hello "+ name;
        }
        if (lang == "ES") {
            return "Hola " + name;
        }
        return "Hi "+ name;
    }

    //write a method to calculate salary
    // method will take hours worked
    // and hourly rate.

    public static double calculateSalary(int hours, double payRate) {
        return hours*payRate;
    }

}
