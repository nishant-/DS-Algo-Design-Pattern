package hackerrank;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {

        Map<Integer, BigInteger> map = new HashMap<>();
        map.put(0,BigInteger.ONE);
        map.put(1,BigInteger.ONE);

        BigInteger fact = BigInteger.ONE;

        for(int i = 2; i <= n; i++) {
            if(map.containsKey(i)) {
                fact = fact.multiply(map.get(i));
            }
            else {
                fact = fact.multiply(BigInteger.valueOf(i));
                map.put(i, fact);
            }
        }
        System.out.println(map.get(n));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
