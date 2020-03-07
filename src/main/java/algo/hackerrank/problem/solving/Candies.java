package algo.hackerrank.problem.solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Candies {

    // Complete the candies function below.
    public static long candies(int n, int[] arr) {

        Map<Integer, Long> posCandyMap = new LinkedHashMap<>();
        for(int i = 0; i < arr.length; i++) {
            posCandyMap.put(i, 1L);
        }
        int candiesCount = arr.length;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] > arr[i]) {
                long c1 = posCandyMap.get(i) + 1;
                posCandyMap.put((i + 1), c1);
            }
        }
        for(int i = arr.length - 1; i >=1; i--) {
            if(arr[i - 1] > arr[i]){
                long c1 = posCandyMap.get(i);
                long c2 = posCandyMap.get(i - 1);

                if(c2 <= c1) {
                    c2 = c1 + 1;
                    posCandyMap.put((i - 1), c2);
                }
            }
        }
        Collection<Long> values =  posCandyMap.values();
        long totalCandies = values.stream().mapToLong(Long::valueOf).sum();

        return totalCandies;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

