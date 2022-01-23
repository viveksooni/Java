package com.vivek;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //take input from use while user does not press X or x
        while(true)
        {
            char c = sc.next().trim().charAt(0);
            if (c=='+' || c=='-' || c=='*' || c=='/' )
            {
                System.out.println("Enter a vallue:");
                int a = sc.nextInt();
                System.out.println("Enter a vallue:");
                int b = sc.nextInt();
                System.out.println("ans:");
                if (c=='+') {
                    System.out.println(a + b);
                }
                if (c=='-') {
                    System.out.println(a - b);
                }
                if (c=='*') {
                    System.out.println(a * b);
                }
                if (c=='/') {
                    System.out.println(a / b);
                }
            }
            else if (c=='x' || c=='X')
                break;
            else
                System.out.println("Invalid operation");
        }
    }
}
