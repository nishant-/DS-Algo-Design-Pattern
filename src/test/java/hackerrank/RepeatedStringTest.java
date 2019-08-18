package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {

        long x = RepeatedString.repeatedString("aabaaaba", 10);
        System.out.println(x);
    }
}

// aabaaabaaa