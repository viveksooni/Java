package com.vivekArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(33);
        list.add(342);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
