package algo.recursion;

import java.math.BigInteger;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertThrows;


class FibonacciTest {

    @Test
    public void fibonacci_of_20_is_6765() {
        assertEquals(Fibonacci.of(20), new BigInteger("6765"));
    }

    @Test
    public void fibonacci_of_0_is_0() {
        assertEquals(Fibonacci.of(0),  BigInteger.ZERO);
    }

    @Test
    public void fibonacci_of_minusOne_throws_IllegalArguementException() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.of(-1));
    }

}