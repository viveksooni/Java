package com.vivekArray;

public class FistOccurence {
    public static void main(String[] args) {
        int[] arr ={2,2,2,3,3,5,6,7};
        int target = 5;
        int idx = binarySearch(arr,target);
        System.out.println(idx);
        System.out.println(arr[idx]);;
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid=0;
        int ans = 0;
        while(start<=end)
        {
            mid = start +(end-start)/2;
            if (arr[mid]==target)
            {   ans = mid;
                end=mid-1;
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
        return ans;}
}
