package algo.arrays.misc;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GradingStudentsTest {

    @Test
    public void gradingStudents() {

        List<Integer> aList =  GradingStudents.gradingStudents(Arrays.asList(73,67,28,33));
        for(int i : aList) {
            System.out.println(i);
        }
    }
}