package algo.common;


import org.junit.gen5.api.Test;

import java.util.Arrays;

import static org.junit.gen5.api.Assertions.assertTrue;


public class MoveZerosToEndTest {

    @Test
    public void moveAllZerosToEnd() {


        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        int [] arr = {-1,0,-2,0,3,0};
        moveZerosToEnd.move(arr);
        assertTrue(Arrays.equals(new int[]{-1,-2,3,0,0,0}, arr));

    }

}