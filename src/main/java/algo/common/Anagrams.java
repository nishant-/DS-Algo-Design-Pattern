package algo.common;

import java.util.Arrays;

public class Anagrams {


    public boolean check(String s1, String s2) {

        char a1 [] = s1.toCharArray();
        char a2 [] = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }

}
