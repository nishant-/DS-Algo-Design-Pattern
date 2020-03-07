package algo.hackerrank.problem.solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MissingNumber {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {

        int arrA [] = new int[200000];
        int arrB [] = new int[200000];
        int min = brr[0];
        int max = brr[0];
        Set<Integer> set = new TreeSet<>();
        int result [] = new int[brr.length];

        for(int i = 0; i < brr.length; i++) {
            if(i < arr.length) {
                arrA[arr[i]] = arrA[arr[i]] + 1;
            }
            if(brr[i] > max) {
                max = brr[i];
            }
            if(brr[i] < min) {
                min = brr[i];
            }
            arrB[brr[i]] = arrB[brr[i]] + 1;
        }
        for(int i = min; i <= max; i++) {
            int cB = arrB[i];
            int cA = arrA[i];
            if(((cA - cB) < 0)) {
                set.add(i);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
