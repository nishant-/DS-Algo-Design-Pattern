package hackerrank;

import hackerrank.problem.solving.ArrayLeftRotation;
import org.junit.Test;

public class ArrayLeftRotationTest {

    @Test
    public void rotLeft() {

        int arr[] = ArrayLeftRotation.leftRotate( 9,new int[]{1,2,3,4,5});
        for (int i : arr) {
            System.out.println(i);
        }
    }
}