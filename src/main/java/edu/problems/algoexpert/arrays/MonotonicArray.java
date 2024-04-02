package edu.problems.algoexpert.arrays;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        int len = array.length;
        int sign = 0;
        for (int i = 0; i < len - 1; i++) {
            int neighbourSign = sign(array[i] - array[i + 1]);
            if (neighbourSign == 0) {
                continue;
            }
            if (sign == 0) {
                sign = neighbourSign;
            }
            if (sign != neighbourSign) {
                return false;
            }
        }
        return true;
    }

    public static int sign(int number) {
        if (number > 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        return 0;
    }
}
