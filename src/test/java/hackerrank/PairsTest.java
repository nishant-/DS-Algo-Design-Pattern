package hackerrank;

import hackerrank.problem.solving.Pairs;
import org.junit.Test;

public class PairsTest {

    @Test
    public void pairs() {

        int x = Pairs.pairs(2, new int[] {1,5,3,4,2});
        System.out.println(x);
    }
}