package edu.problems.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortMergedArraysTest {

    @Test
    public void shouldSortCorrectly() {

        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        SortMergedArrays sortMergedArrays = new SortMergedArrays();
        sortMergedArrays.merge(nums1, 3, nums2,  3);
        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums1);

        int[] nums3 = { 1 };
        sortMergedArrays.merge(nums3, 1, new int[] {}, 0);
        assertArrayEquals(new int[] {1}, nums3);

        int[] nums5 = { 0 };
        sortMergedArrays.merge(nums5, 0, new int[] {1}, 1);
        assertArrayEquals(new int[] {1}, nums5);

        int[] nums7 = {2, 0};
        sortMergedArrays.merge(nums7, 1, new int[] {1}, 1);

    }
}
