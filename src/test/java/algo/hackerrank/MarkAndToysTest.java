package algo.hackerrank;

import algo.hackerrank.problem.solving.MarkAndToys;
import org.junit.Test;

public class MarkAndToysTest {

    @Test
    public void maximumToys() {

        int count = MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50);
        System.out.println(count);
    }
}