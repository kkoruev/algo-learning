package edu.problems.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubArrayProductLessThanKTest {

    @Test
    public void shouldReturnCorrectNumber() {
        SubArrayProductLessThanK subArrayProductLessThanK = new SubArrayProductLessThanK();
        int[] num = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        assertEquals(18,  subArrayProductLessThanK.numSubarrayProductLessThanK(num, 19));
//
        int[] num2 = {10,5,2,6};
        assertEquals(8,  subArrayProductLessThanK.numSubarrayProductLessThanK(num2, 100));

        int[] num3 = {10,2,2,5,4,4,4,3,7,7};
        assertEquals(31,  subArrayProductLessThanK.numSubarrayProductLessThanK(num3, 289));

    }
}
