package algo.dynamicprogramming;

import util.Tuple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumProblem {

    /**
     *  Given an array of n integers, find all pair of integers in the array that add to
     *  a given sum - S
     *
     *  This solution uses memoization
     */
    
    public List<Tuple<Integer, Integer>> solve(int arr[] , int sum) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Tuple<Integer,Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];
            if(map.containsValue(diff)){
                list.add(Tuple.of(arr[i], diff));
            }
            else {
                map.put(i, arr[i]);
            }
        }
        return list;
    }
}



