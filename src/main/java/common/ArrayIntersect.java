package common;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two arrays, find the elements common in the 2 arrays
 * and print the result as an ArrayList
 *
 */

public class ArrayIntersect {


    public List<Integer> find(int[] a, int[] b) {

        Arrays.sort(b);
        List<Integer> aList = new ArrayList<>();
        for(int i = 0 ; i < a.length ; i++) {

           int index =  Arrays.binarySearch(b,a[i]);
           if(index > 0) {
               aList.add(a[i]);
           }
        }
        return aList;
    }
}
