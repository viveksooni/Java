package com.vivekArray;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 65;
        int[] arr = {1,3,4,5,6,8};
        int index = linearSearch(arr,target);
        System.out.println(index);

    }

    static int linearSearch(int[] arr, int target)
    {
        if (arr.length ==0)
            return -1;
        else
        {
            for(int chai=0;chai<arr.length;chai++){
                if (arr[chai]==target)
                {
                    return chai;
                }
            }
        }
        return -1;
    }
}
