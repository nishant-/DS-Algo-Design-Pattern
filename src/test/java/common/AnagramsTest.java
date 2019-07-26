package common;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsTest {


    @Test
    public void anagramCheck() {
        Anagrams anagrams = new Anagrams();

        String s1 = "abc";
        String s2 = "cba";



        Assert.assertTrue(anagrams.check(s1,s2));


    }

}