package edu.problems.leetcode;

import java.util.Arrays;

public class MaxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {
        int maxSeqZeros = 0;

        int max = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                maxSeqZeros++;
            }

            while(maxSeqZeros > k) {
                if (nums[left] == 0) {
                    maxSeqZeros--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
            System.out.println("Left " + left + " Right " + right + " Max " + max);

        }

        return max;
    }
}
