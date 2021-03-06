package algo.hackerrank.problem.solving;

import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {

        int arr[] = new int[101];

        for(int i: a) {
            arr[i] = arr[i] + 1;
        }
        int max = 0;
        for(int i = 1; i < arr.length - 1;i++) {
            max = Math.max(max, (arr[i] + arr[i + 1]));
        }
        return max;
    }

}

public class PickingNumbers {

    public static void main(String[] args) {

        Result.pickingNumbers(Arrays.asList(99,99,88,88,100,100,100,100,100));

    }

}
