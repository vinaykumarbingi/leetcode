package com.vinay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result.toString());

    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {

        List<Integer> list=new ArrayList<>();
        int i=0;
        while ( i<arr.length)
        {
            int correct=arr[i]-1;
            if( arr[i] != arr[correct])
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
                list.add(index+1);
            }
        }
        return list;

    }

    public static void swap(int[] arr, int first, int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
