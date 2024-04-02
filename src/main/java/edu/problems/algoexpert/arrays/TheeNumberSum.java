package edu.problems.algoexpert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TheeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> result = new ArrayList<>();

        int n = array.length;

        Arrays.sort(array);

        for (int i = 0; i < n - 2; i++) {
            int currentN = i;
            int left = currentN + 1;
            int right = n - 1;
            while(left < right) {
                int sum = array[currentN] + array[left] + array[right];
                if (sum  == targetSum) {
                    Integer[] triplet = {array[currentN], array[left], array[right]};
                    result.add(triplet);
                    left++;
                    right--;
                }
                if (sum > targetSum) {
                    right--;
                }
                if (sum < targetSum) {
                    left++;
                }
            }
        }

        Collections.sort(result, new Comparator<Integer[]>() {
            public int compare(Integer[] arr1, Integer[] arr2) {
                for (int i = 0; i < 3; i++) {
                    if (!arr1[i].equals(arr2[i])) {
                        return arr1[i].compareTo(arr2[i]);
                    }
                }
                return 0;
            }
        });
        return result;
    }
}
