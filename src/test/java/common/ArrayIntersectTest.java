package common;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayIntersectTest {

    @Test
    public void intersectTest() {
        int a [] = {1,2,3,5,8};
        int b [] = {5,2,9,7,0};

        ArrayIntersect arrayIntersect = new ArrayIntersect();
        List<Integer> aList = arrayIntersect.find(a,b);

        assertTrue(aList.equals(Arrays.asList(2,5)));
    }

}