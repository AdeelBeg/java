package com.company;

import java.util.*;

public class Main {
public static void main(String[] args) {
       
       /// project calculator
        
        Scanner scaan = new Scanner(System.in);
        System.out.println("enter first number");
                float n = scaan.nextFloat();
        System.out.println("enter second number");
                float k = scaan.nextFloat();
        System.out.println("You have entered");
        System.out.print(n); System.out.print("  and  "); System.out.println(k);
        
String action ="Press 0 for addition\nPress 1 for Subtraction\nPress 2 for Multiplication\nPress 3 for Divide\nPress 4 for Reminder ";
        System.out.println(action);
                int act= scaan.nextInt();
                switch (act){
                    case 0: {
                        System.out.println("Your Result of Addition = "); System.out.println(n+k);
                        break;
                    }
                    case 1: {
                        System.out.println("Your Result of Substraction = "); System.out.println(n-k);
                        break;
                    }
                    case 2: {
                        System.out.println("Your Result of Multiplication = "); System.out.println(n*k);
                        break;
                    }
                    case 3: {
                        System.out.println("Your Result of Divide = "); System.out.println(n/k);
                        break;
                    }
                    case 4: {
                        System.out.println("Your Result for Reminder = "); System.out.println(n%k);
                        break;
                    }
                    default:
                        System.out.println("invalid input bhai");
                }
    }
}
