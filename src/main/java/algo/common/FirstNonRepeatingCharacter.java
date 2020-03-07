package algo.common;


/*
 * find the first non-repeating character, e.g aabccc => b
 *  "xxccvbnmkvv" => v
 * if none found  => print not found
 * string contains only lowercase alphabets [a-z]
 *
 * non-repeating character occurs only once!!
 *
 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(find("aabccdddeeeffgxxx")); // prints b
        System.out.println(find("xiijjaccc")); // prints x
        System.out.println(find("aabbccddeeffgg")); // prints not found
    }

    public static String find(String s) {

        Map<Character, Integer> charCount = new LinkedHashMap<>();
       for(int i = 0; i < s.length(); i++) {
            charCount.compute(s.charAt(i), (k, v) -> (v == null) ? 1 : v + 1);
        }

        Optional<String> first = charCount.entrySet().stream().
                filter(x -> x.getValue() == 1).
                map(x -> String.valueOf(x.getKey())).
                findFirst();

        return first.orElseGet(() -> "Not found");
    }

}
