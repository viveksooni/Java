package com.vivekArray;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9,10,45,67,77};
        int target = 99;
        //return index
        int idx = binarySearch(arr,target);
        System.out.println(idx);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid;
        while(start<=end)
        {
            mid = start +(end-start)/2;
            if (arr[mid]==target)
            {
                return mid;
            }
            else if (arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
}
