package edu.problems.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void shouldReturnCorrectNumber() {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int[] num = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        assertEquals(10, maxConsecutiveOnes.longestOnes(num, 3));
    }
}
