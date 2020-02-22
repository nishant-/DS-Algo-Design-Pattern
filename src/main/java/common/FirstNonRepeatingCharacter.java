package common;


/*
 * find the first non-repeating character, e.g aabccc => b
 *  "xxccvbnmkvv" => v
 * if none found  => print not found
 * string contains only lowercase alphabets [a-z]
 *
 * non-repeating character occurs only once!!
 *
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(find("aabccdddeeeffgxxx")); // prints b
        System.out.println(find("xiijjaccc")); // prints x
        System.out.println(find("aabbccddeeffgg")); // prints not found

    }


    public static String find(String s) {

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        String nonRepChar = "Not found";
        for(int i = 0; i < s.length(); i++) {
            charCount.compute(s.charAt(i), (k, v) -> (v == null) ? 1 : v + 1);
        }
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if(entry.getValue() == 1) {
                nonRepChar = String.valueOf(entry.getKey());
                return nonRepChar;
            }
        }
        return nonRepChar;
    }

}
