package com.vivekArray;
//return the smaller no. that is smaller or equal to target
public class FloorOfArray {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target = 1;
        int idx =ceilInArray(arr,target);
        System.out.println(" \tindex: "+idx);
    }//but if target is smaller  than the smallest no.of array then there will be no no.
    static int ceilInArray(int[] arr, int target)
    {

        int start = 0;
        int end = arr.length -1;
        int mid ;
        if (target<arr[0])
        {return -1;}
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
            else{
                start = mid+1;
            }
        }
        return end;
    }
}

