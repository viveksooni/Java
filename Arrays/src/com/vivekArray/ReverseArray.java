package com.vivekArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int i=0;
        int j =arr.length-1;
        System.out.println(Arrays.toString(arr));
        while(i<j)
        {
            swap(i,j,arr);
            i++;
            j--;
        }
        for(int a:arr)
        {
            System.out.println(a);
        }
    }

    private static void swap(int i, int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
