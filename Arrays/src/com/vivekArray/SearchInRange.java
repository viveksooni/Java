package com.vivekArray;

public class SearchInRange {
    public static void main(String[] args) {
        int start = 1;
        int end =3;
        int[] arr = {1,3,4,5,6,8,7,9};
        int target =5;
       int a= linearSearch(arr,target,start,end);
        System.out.println(a);
    }
    static int linearSearch(int[] arr, int target,int start, int end)
    {
        if (arr.length ==0) {
            return -1;
        } else
        {
            for(int chai=start;chai<=end;chai++){
                if (arr[chai]==target)
                {
                    return chai;
                }
            }
        }
        return -1;
    }
}
