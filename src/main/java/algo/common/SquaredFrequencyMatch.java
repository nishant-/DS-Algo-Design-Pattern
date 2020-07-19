package algo.common;

/*
 * Write a function same which accepts two arrays.
 * The function returns true if every value in the array has its
 * corresponding value squared in the second array. The frequency of values must be same
 * e.g same([1,2,3], [9,1,4]) => true
 *     same([1,4,9,9], [1,16,81]) => false
 *     same([1,1,2,2,3,3], [1,1,9,4,4,9]) => true
 *
 * constraints : max integer value = 100
 *
 * */

import java.util.HashMap;
import java.util.Map;

public class SquaredFrequencyMatch {

    private static boolean same(int arr1[], int arr2[]) {

        if (arr1.length != arr2.length)
            return false;

        Map<Integer, Integer> freqMap1 = new HashMap<>();
        Map<Integer, Integer> freqMap2 = new HashMap<>();

        for (int i : arr1) {
            freqMap1.compute(i, (k, v) -> (v == null) ? 1 : v + 1);
        }

        for (int i : arr2) {
            freqMap2.compute(i, (k, v) -> (v == null) ? 1 : v + 1);
        }

        int count = 0;

        for (int i : freqMap1.keySet()) {
            if (freqMap2.containsKey(i * i) && (freqMap1.get(i)).equals(freqMap2.get(i * i))) {
                count++;
            }
        }

        return count == freqMap1.size();

    }


    public static void main(String[] args) {

        System.out.println(same(new int[]{1, 2, 3, 6, 6}, new int[]{36, 1, 4, 9, 36}));
        System.out.println(same(new int[]{1}, new int[]{36, 1, 4, 9, 36}));
        System.out.println(same(new int[]{1,4,9,9,5}, new int[]{81,1,16,81,100}));
    }

}
