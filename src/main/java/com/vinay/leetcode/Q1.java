package com.vinay.leetcode;

import java.util.Arrays;

public class Q1 {
//    https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] inputList = {2,7,11,15};
        int target = 9;
        int[] result= twoSum(inputList,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}
