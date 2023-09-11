package com.hieudev.leetcode.array;

public class _1295FindNumbersEvenDigits {
    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while(num != 0) {
            num = num/10;
            count++;
        }
        return count;
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i=0; i< nums.length; i++) {
            if (countDigits(nums[i])%2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = {12,345,2,6,7896};
        System.out.println(findNumbers(temp));
    }
}
