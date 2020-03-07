package algo.hackerrank.problem.solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    public static long repeatedString(String s, long n) {

        int length = s.length();
        long q = n / length;
        int r = (int) (n % length);

        int count = 0;
        long totalCount = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        if (r == 0) { // repeat string n times
            // count a's in s and multiply by n
            totalCount = count * n;
        } else { // repeat string q times + add the substring (length - r, length)
            // count a's in s and multiply by q and add count of a's in the substring (length - r, length)
            String substr = s.substring(0, r);
            //count a's in substr
            int substACount = 0;
            for (int i = 0; i < substr.length(); i++) {
                if (substr.charAt(i) == 'a') {
                    substACount++;
                }
            }
            totalCount = (count * q) + substACount;
        }
        return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
