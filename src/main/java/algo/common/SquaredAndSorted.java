package algo.common;


import java.util.Arrays;

/**
 * Given a sorted array containing negative and positive number,
 * Write a function which returns an array which is the square of each number in a sorted order
 * e.g. input array = [-8,-4,-3,1,2,5,7]
 *  output = >        [1,4,9,16,25,49,64]
 *
 */

public class SquaredAndSorted {


    public static void main(String[] args) {

        int arr[] = squaredAndSorted(new int[]{-8,-4});
        System.out.println(Arrays.toString(arr));

    }

    public static int [] squaredAndSorted(int arr[]) {

        int beginIndex = 0;
        int endIndex = arr.length - 1;
        int result[] = new int[arr.length];
        int resultBegin = 0;
        int resultEnd = arr.length - 1;

        while(beginIndex <= endIndex) {

            if(Math.abs(arr[beginIndex]) > Math.abs(arr[endIndex])) {
                result[resultEnd] = arr[beginIndex] * arr[beginIndex];
                beginIndex++;
            }
            else {
                result[resultEnd] =  arr[endIndex] * arr[endIndex];
                endIndex--;
            }
            resultEnd = resultEnd - 1;
        }
        return result;
    }
}
