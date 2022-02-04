package com.vivekArray.test;

import java.util.Scanner;

public class jav {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String input = sc.next();
        String ans= "";
        char[] c = input.toCharArray();

        for(int i =0;i<c.length;i++) {
            if (c[i] == '_')
            {
                i++;
                char chr = Character.toUpperCase(c[i]);
                ans+=chr;
            }
            else{
                ans+=c[i];
            }
        }
        System.out.println(ans);
    }

}
