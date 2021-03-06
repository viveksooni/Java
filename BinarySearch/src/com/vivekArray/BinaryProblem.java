package com.vivekArray;
//find ceil in the given array
// means the smallest no. which is greater than or equal to the target
public class BinaryProblem {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target = 6;
        int idx =ceilInArray(arr,target);
        System.out.println(arr[idx]+"\tindex: "+idx);
    }
    static int ceilInArray(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;
        int mid ;
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
        return start;
    }
}
