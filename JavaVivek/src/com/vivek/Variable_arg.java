package com.vivek;
import java.util.*;
public class Variable_arg
{
    public static void main(String[] args) {
        fun(4,3,2,4,5);


    }

    private static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}