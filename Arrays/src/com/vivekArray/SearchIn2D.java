package com.vivekArray;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5},
                {6,32,45},
                {2,54,23}
        };
        int target = 2;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    private static int[] search(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1};
    }
}
