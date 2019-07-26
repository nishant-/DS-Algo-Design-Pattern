package common;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReversalTest {



    @Test
    public void reverseUsingStringBuilder() {
        StringReversal stringReversal = new StringReversal();
        String reversed = stringReversal.reverseWithStringBuilder("ABCD");
        Assert.assertEquals("DCBA", reversed);
    }

    @Test
    public void reverseUsingCharArray() {
        StringReversal stringReversal = new StringReversal();
        String reversed = stringReversal.reverseUsingArray("axsd dsax");
        Assert.assertEquals("xasd dsxa", reversed);
    }

}