package com.vinay.leetcode;

public class Q2 {
//    https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int[] list = {3,0,1};
        System.out.println(missingNumber(list));
    }

    public static int missingNumber(int[] arr)
    {
        int i=0;
        while ( i<arr.length)
        {
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct])
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
            if(arr[index] != index)
            {
                return index;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int first, int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
