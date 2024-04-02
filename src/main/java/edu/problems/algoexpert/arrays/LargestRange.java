package edu.problems.algoexpert.arrays;

import java.util.Arrays;

public class LargestRange {

    public static int[] largestRange(int[] array) {
        Arrays.sort(array);
        int rangeSeq = 0;
        int currentRange = 0;

        int rangeStart = 0;
        int rangeEnd = 0;

        int leftP = 0;
        int rightP = 0;

        if (array.length == 1) {
            return new int[] { array[rangeStart], array[rangeEnd] };
        }

        for (int i = 0; i < array.length - 1; i++) {
            int diff = array[i + 1] - array[i];
            if (diff == 1) {
                if (currentRange == 0) {
                    leftP = i;
                }
                currentRange++;
                rightP = i + 1;
            } else if (diff == 0) {
                rightP = i + 1;
            } else {
                currentRange = 0;
            }

            if (currentRange > rangeSeq) {
                rangeSeq = currentRange;
                rangeStart = array[leftP];
                rangeEnd = array[rightP];
            }

        }

        return new int[] { rangeStart, rangeEnd };
    }
}
