package algo.common;

/*
 * Given a sorted array, find the count of unique values in the array.
 * e.g. [1,1,2,2,3,3,4,5,6,7] => 7
 *  [] => 0
 *  [-2,1,2,3,4] => 5
 * */

public class CountUniqueValues {

    private static final int countUniqueValues(int arr[]) {

        if (arr.length == 0) {
            return 0;
        }

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countUniqueValues(new int[]{}));
        System.out.println(countUniqueValues(new int[]{-1,-1,-1,0,0,1,1,1,1,3,4,5}));

    }

}
