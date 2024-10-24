package com.vinay.leetcode;

import java.util.Arrays;

public class Q4 {
//
    public static void main(String[] args) {

        int[] nums = {1,2,2,4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] arr)
    {
        int i=0;
        while ( i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        //search missing element
        for (int index=0;index<arr.length;index++)
        {
            if(arr[index] != index+1)
            {
                return new int[] {arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[] arr, int first, int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
