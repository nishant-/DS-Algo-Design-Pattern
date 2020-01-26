package hackerrank;

import hackerrank.problem.solving.HowManySubstrings;
import org.junit.Test;

public class HowManySubstringsTest {

    @Test
    public void countSubstrings() {

        int arr[] = HowManySubstrings.countSubstrings("aabaa", new int[][]{{0,2}});

        for(int i : arr) {
            System.out.println(i);
        }
    }
}