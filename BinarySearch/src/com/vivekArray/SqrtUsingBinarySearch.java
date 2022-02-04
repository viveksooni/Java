package com.vivekArray;

import java.util.Scanner;

public class SqrtUsingBinarySearch {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
       double sqrt =  binarysearch(8);
        System.out.println(sqrt);

    }
    static double binarysearch(int num)
    {
        int start = 0;
        int end = num;
        int mid;
        double ans =0;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if (mid*mid == num) {
                ans = mid;
                return ans;
            }
            else if (Math.ceil(mid*mid)<num )
            {
                start = mid+1;

            }
            else
            {
                end=mid-1;
            }

        }
        return start-1;
    }


}

