package algo.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(1234);
        assertEquals(4321, result);
    }
}