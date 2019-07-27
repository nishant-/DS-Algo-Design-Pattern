package common;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class MoveZerosToEndTest {

    @Test
    public void moveAllZerosToEnd() {


        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        int [] arr = {-1,0,-2,0,3,0};
        moveZerosToEnd.move(arr);
        Assert.assertTrue(Arrays.equals(new int[]{-1,-2,3,0,0,0}, arr));

    }

}