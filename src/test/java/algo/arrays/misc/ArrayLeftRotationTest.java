package algo.arrays.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayLeftRotationTest {

    @Test
    public void rotLeft() {

        int arr[] = ArrayLeftRotation.rotLeft(new int[]{1,2,3,4,5}, 9);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}