package algo.hackerrank.problem.solving;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> socks = Arrays.stream(ar)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(count -> 1)));

        int count = 0;

        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            count = count + (entry.getValue() >> 1);
        }
        return count;

    }

    public static void main(String[] args) {

        int x = sockMerchant(10, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3});
        System.out.println(x);

    }


}
