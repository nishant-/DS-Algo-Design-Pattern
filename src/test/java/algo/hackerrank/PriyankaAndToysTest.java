package algo.hackerrank;

import algo.hackerrank.problem.solving.PriyankaAndToys;
import org.junit.Test;

public class PriyankaAndToysTest {

    @Test
    public void toys() {

        int x = PriyankaAndToys.toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21});
        System.out.println(x);
    }
}