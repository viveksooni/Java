package com.vivekArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int[] a = {1,3,5,3,6,4};
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }
        System.out.println("____________");
        System.out.println(Arrays.toString(a));
        System.out.println("++++++++++++++++++++");
        for(int i:a)
        {
            System.out.println(i);
        }

    }
}
