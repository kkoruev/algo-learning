package edu.problems.algoexpert.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MonotonicArrayTest {

    @Test
    public void shouldReturnCorrectOutput() {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean actual = MonotonicArray.isMonotonic(array);
        Assert.assertTrue(actual);
    }
}
