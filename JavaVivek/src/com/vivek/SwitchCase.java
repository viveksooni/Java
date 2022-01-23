package com.vivek;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("mango");
            case "apple" -> System.out.println("apple");
            default -> System.out.println("default");
            case "grapes" -> System.out.println("grapes");
        }
    }
}

