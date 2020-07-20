package algo.recursion;

import java.util.function.Predicate;

public class VerifyOdd {

    private static final boolean verifyOdd(int arr[], Predicate<Integer> isOdd) {

        //return true if a value from the array passed to the predicate returns true

        int begin = 0;
        int end = arr.length;

        return verifyOdd(arr, begin, end, isOdd);

    }

    private static boolean verifyOdd(int[] arr, int begin, int end, Predicate<Integer> isOdd) {

        if (begin == end)
            return false;
        if (isOdd.test(arr[begin]))
            return true;
        return verifyOdd(arr, begin + 1, end, isOdd);

    }

    public static void main(String[] args) {

        System.out.println(verifyOdd(new int[]{3, 2, 4, 6, 8, 2, 8, 5}, i -> i % 2 != 0));
        System.out.println(verifyOdd(new int[]{2, 4, 6, 8, 2, 8, 16, 32, 64}, i -> i % 2 != 0));

    }
}
