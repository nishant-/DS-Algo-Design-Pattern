package algo.common;

import org.junit.gen5.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AnagramsTest {


    @Test
    public void anagramCheck() {
        Anagrams anagrams = new Anagrams();

        String s1 = "abc";
        String s2 = "cba";


        assertTrue(anagrams.check(s1,s2));


    }

    @org.junit.jupiter.api.Test
    void check() {
    }
}