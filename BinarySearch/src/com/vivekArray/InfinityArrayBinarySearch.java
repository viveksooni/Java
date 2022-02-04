package com.vivekArray;

public class InfinityArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        InRange(arr,target);

    }

    static void InRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]){

            int temp = end + 1;
            //new end = end+ (box size)*2
            end=end+(end-start+1 )*2;
            start = temp;
        }

            int idx=binarySearch(arr, target, start, end);
//            System.out.println(start+" "+end);
            System.out.println(idx+" "+arr[idx]);

        }


    static int binarySearch(int[] arr, int target, int start, int end) {

        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}