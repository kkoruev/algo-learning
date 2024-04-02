package edu.problems.leetcode;

public class SubArrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int left = 0;
        int numOfSubArrays = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            numOfSubArrays += right - left + 1;
        }

        return numOfSubArrays;
    }
}
