package algo.common;


import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public class StringReversalTest {



    @Test
    public void reverseUsingStringBuilder() {
        StringReversal stringReversal = new StringReversal();
        String reversed = stringReversal.reverseWithStringBuilder("ABCD");
        assertEquals("DCBA", reversed);
    }

    @Test
    public void reverseUsingCharArray() {
        StringReversal stringReversal = new StringReversal();
        String reversed = stringReversal.reverseUsingArray("axsd dsax");
        assertEquals("xasd dsxa", reversed);
    }

}