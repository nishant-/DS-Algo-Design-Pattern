package algo.common;

import org.junit.gen5.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ArrayIntersectTest {

    @Test
    public void intersectTest() {
        int a [] = {1,2,3,5,8};
        int b [] = {5,2,9,7,0};

        ArrayIntersect arrayIntersect = new ArrayIntersect();
        List<Integer> aList = arrayIntersect.find(a,b);

        assertTrue(aList.equals(Arrays.asList(2,5)));
    }

    @org.junit.jupiter.api.Test
    void find() {
    }
}