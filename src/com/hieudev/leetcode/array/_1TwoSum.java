package com.hieudev.leetcode.array;

import java.util.Arrays;

public class _1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for (int i=0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        _1TwoSum obj = new _1TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(arr, 9)));
    }
}
