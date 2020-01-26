package hackerrank.problem.solving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxPerimeterTriangle {

    // Complete the maximumPerimeterTriangle function below.
    public static int[] maximumPerimeterTriangle(int[] sticks) {

        long maxPerimeter = -1;
        int arr[] = new int[3];
        boolean triangleExists = false;

       for(int i = sticks.length - 1; i >= 1; i--) {

            int a = sticks[i];
            int b = sticks[i - 1];

            for(int j = i+2; j < sticks.length; j++) {
                int c = sticks[j];

                if(isValidTriangle(a, b, c)) {
                    long perimeter = a + b + c;
                    if(perimeter > maxPerimeter) {
                        maxPerimeter = perimeter;
                        arr[0] = a;
                        arr[1] = b;
                        arr[2] = c;
                        triangleExists = true;
                    }
                }
            }
        }
        return triangleExists ? arr : new int[]{-1};
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return ((a + b > c) && (a + c > b) && (b + c > a));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] sticks = new int[n];

        String[] sticksItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int sticksItem = Integer.parseInt(sticksItems[i]);
            sticks[i] = sticksItem;
        }

        int[] result = maximumPerimeterTriangle(sticks);

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
