package com.vivek;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean kk=isPrime(num);
        System.out.println(kk);
    }
    public static boolean isPrime(int num)
    {
        if (num<=1)
            return false;
        int i=2;
        while(i*i<=num)
        {
            if(num%i==0)
                return false;
            i++;

        }
        return true;

    }

}


