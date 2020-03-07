package algo.hackerrank.problem.solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FibonacciModified {

    // Complete the fibonacciModified function below.
    static BigInteger fibonacciModified(int t1, int t2, int n) {


        BigInteger fibo = BigInteger.ZERO;

        Map<Integer, BigInteger> fiboMap = new HashMap<>();

        fiboMap.put(1, BigInteger.valueOf(t1));
        fiboMap.put(2, BigInteger.valueOf(t2));

        for(int i = 3 ; i <= n; i++) {
            fibo = (fiboMap.get(i - 2)).add(fiboMap.get(i - 1).pow(2));
            fiboMap.put(i, fibo);
        }

        return fiboMap.get(n);

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        BigInteger result = fibonacciModified(t1, t2, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
