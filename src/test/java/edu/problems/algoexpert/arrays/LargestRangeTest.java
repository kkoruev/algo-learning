package edu.problems.algoexpert.arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LargestRangeTest {

    @Test
    public void expectCorrectOutput() {
        int[] expected = {0, 7};
        boolean match = Arrays.equals(LargestRange.largestRange(new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}), expected);
        Assert.assertTrue(match);
    }
}
