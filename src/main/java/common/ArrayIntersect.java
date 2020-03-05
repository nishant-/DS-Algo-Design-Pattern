package common;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given two arrays, find the elements common in the 2 arrays
 * and print the result as an ArrayList
 *
 */

public class ArrayIntersect {


    public List<Integer> find(int[] a, int[] b) {

        Arrays.sort(b);

        return Arrays.stream(a).
                filter(x -> (Arrays.binarySearch(b, x) > 0))
                .boxed()
                .collect(Collectors.toList());
    }
}
