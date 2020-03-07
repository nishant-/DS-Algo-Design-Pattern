package algo.common;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(1234);
        Assert.assertEquals(4321, result);
    }
}