package com.company;

import java.util.Scanner;

public class IFPractice {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int countryCode = 10;//scanner.nextInt();

        switch (countryCode){
            case 1 : {
                System.out.println("USA");
            }break;
            case 44 : {
                System.out.println("UK");
            }break;
            case 60 : {
                System.out.println("Malaysia");
            }break;
            case 91 : {
                System.out.println("India");
            }break;
            default: {
                System.out.println("Not a valid code");
            }
        }


        for  ( int i = 0 ; i < 2   ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Running Inner");
                for (int k = 0; k < 2; k++) {
                    System.out.println("Inner inner");
                }
            }
        }

        for (int i = 0, j =0 ; i< 10 && j <4 ; i++,j++){
            System.out.println("I ->"+i +"  j-> ") ;
        }

        int count = 0;
        boolean runLoop = true;
//        while (count<10 && runLoop){
//            System.out.println("Running count loop");
//            count++;
//        }

        do {
            System.out.println("Do While ");
            count++;
        }while (count<10 && runLoop);

        //calculate sum of whole numbers from 1to 100.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum+i;
        }
        System.out.println("Sum "+ sum);
    }
}
