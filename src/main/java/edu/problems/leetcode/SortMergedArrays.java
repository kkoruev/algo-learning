package edu.problems.leetcode;

public class SortMergedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pm = m - 1;
        int pn = n - 1;
        int pEnd = m + n - 1;

        while (pn >= 0) {

            if (pm >= 0 && nums1[pm] > nums2[pn]) {
                nums1[pEnd] = nums1[pm];
                pEnd--;
                pm--;
            } else {
                nums1[pEnd] = nums2[pn];
                pn--;
                pEnd--;
            }

        }

    }

}
