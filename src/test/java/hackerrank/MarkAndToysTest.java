package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarkAndToysTest {

    @Test
    public void maximumToys() {

        int count = MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50);
        System.out.println(count);
    }
}