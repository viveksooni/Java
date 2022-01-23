package com.vivek;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s = sc.next().trim().charAt(0);
        System.out.println(s);
        if (s >'a' && s<'z')
            System.out.println("small");
        else
            System.out.println("big");


    }
}
