package algo.common;

/*
 * write a function maxSubArraySum which accepts an array of integers
 * and a number called n. The function should calculate the maximum sum of n consecutive elements in the array
 * e.g array = [1,2,5,2,8,1,5], n=2 max sum =10, [2,8]
 *     array = [1,2,5,2,8,1,5], n = 4 max sum = 17 [2,5,2,8]
 *     array = [4,2,1,6], n = 1 mx sum = 6 [6]
 *
 * */

public class MaxSubarraySum {

    private static final int maxSubArraySum(int arr[], int n) {

        int initialSum = 0;
        for (int i = 0; i < n; i++) {
            initialSum += arr[i];
        }

        int maxSum = initialSum;

        for (int j = n; j < arr.length; j++) {
            initialSum = initialSum + arr[j] - arr[j - n];
            maxSum = Math.max(maxSum, initialSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {

        System.out.println(maxSubArraySum(new int[]{1, 2, 5, 2, 8, 1, 5}, 2)); // prints 10
        System.out.println(maxSubArraySum(new int[]{1, 2, 5, 2, 8, 1, 5}, 4)); // 17
    }

}
