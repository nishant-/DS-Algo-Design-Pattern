package algo.common;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(1234);
        assertEquals(4321, result);
    }
}