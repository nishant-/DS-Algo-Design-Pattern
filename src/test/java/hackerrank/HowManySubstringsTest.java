package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class HowManySubstringsTest {

    @Test
    public void countSubstrings() {

        int arr[] = HowManySubstrings.countSubstrings("aabaa", new int[][]{{0,2}});

        for(int i : arr) {
            System.out.println(i);
        }
    }
}