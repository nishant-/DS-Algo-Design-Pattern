package algo.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import util.Tuple;

import java.util.List;

public class TwoSumProblemTest {


    @Test
    public void findPairs_fromTheGivenArray_thatWhenAddedEqualsToTargetSum() {

        int targetSum = 6;
        int arr [] = {5,1};

        TwoSumProblem twoSumProblem = new TwoSumProblem();
        List <Tuple<Integer, Integer>> aList = twoSumProblem.solve(arr, targetSum);

        Assert.assertEquals(Tuple.of(1,5), aList.get(0));



    }

}