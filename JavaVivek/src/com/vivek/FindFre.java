package com.vivek;

import java.util.Scanner;

public class FindFre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count =0;
        while(num>0)
        {
            int rem =(int)(num%10);
            if (rem==7)
            {
                count++;
            }
            num =(long)(Math.floor((num/10)));

        }
        System.out.println(count);
    }
}
