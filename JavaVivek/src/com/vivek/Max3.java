package com.vivek;
import java.util.*;

public class Max3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max =a;
        if (b>a){
            max = b;
        }
        if (max<c)
        {
            max =c;
        }
        System.out.println("max is "+max);
    }
}
