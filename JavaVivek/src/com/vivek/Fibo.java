package com.vivek;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p =1;
        int i = 0;
        int count =2;
        while(count<=n)
        {
            int temp = p;
            p = p+i;
            i=temp;
            count++;
        }
        System.out.println(p);
    }
}
