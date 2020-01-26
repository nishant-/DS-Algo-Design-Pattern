package hackerrank;

import hackerrank.problem.solving.RepeatedString;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {

        long x = RepeatedString.repeatedString("aabaaaba", 10);
        System.out.println(x);
    }
}

// aabaaabaaa