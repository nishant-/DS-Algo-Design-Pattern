package algo.common;

/*
 * Write a function called sameFrequency. Given 2 positive integers, find out if 2 numbers have same frequency of
 * digits
 * e.g. (182,821) => true
 *    (123,345) => false
 *    (100, 10000) => false
 *
 * */

import java.util.HashMap;
import java.util.Map;

public class SameFrequency {

    private static final boolean sameFrequency(int n, int m) {

        String num1 = Integer.toString(n);
        String num2 = Integer.toString(m);

        if (num1.length() != num2.length())
            return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : num1.toCharArray()) {
            map1.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
        }
        for (char c : num2.toCharArray()) {
            map2.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
        }

        if (map1.size() != map2.size()) {
            return false;
        }
        int count = 0;

        for (char c : map1.keySet()) {
            if (map2.containsKey(c) && (map2.get(c)).equals(map1.get(c))) {
                count++;
            }
        }
        return count == map1.size();
    }

    public static void main(String[] args) {

        System.out.println(sameFrequency(1231,3211));
        System.out.println(sameFrequency(11231,32110));

    }
}
