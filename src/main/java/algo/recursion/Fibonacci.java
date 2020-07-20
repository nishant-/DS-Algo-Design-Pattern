package algo.recursion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static Map<Integer, BigInteger> fiboMap = new HashMap<>();

    static {
        fiboMap.put(0, BigInteger.ZERO);
        fiboMap.put(1, BigInteger.ONE);
        fiboMap.put(2, BigInteger.ONE);
    }

    public static BigInteger of(int n) {

        if (n < 0)
            throw new IllegalArgumentException("number must be positive");

        if (!fiboMap.containsKey(n)) {
            fiboMap.put(n, of(n - 1).add(of(n - 2)));
        }

        return fiboMap.get(n);
    }
}