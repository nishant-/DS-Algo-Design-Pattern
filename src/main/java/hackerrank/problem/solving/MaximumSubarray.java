package hackerrank.problem.solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximumSubarray {

    // Complete the maxSubarray function below.
    static int[] maxSubarray(int[] arr) {


        int currMax = arr[0];
        int maxSum = arr[0];
        int subSeq = arr[0];
        int maxSubSeqSum = arr[0];
        int sum = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            if(currMax > maxSum) {
                maxSum = currMax;
            }
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] > 0 ) {
                if(i == 1 && sum < 0) {
                    sum = 0;
                }
                sum = sum + arr[i];
            }
        }
        maxSubSeqSum = (sum > 0) ? sum : max;

        return new int[]{maxSum, maxSubSeqSum};

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        maxSubarray(new int[] {-2, -3, -1, -4, -6});


    }
}
