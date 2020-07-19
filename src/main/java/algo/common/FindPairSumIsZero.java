package algo.common;

/*
    Write  function sumZero which accepts a sorted array of integers. (sorted in increasing order)
    The function should find the first pair where the sum is zero
    e.g. [-1,0,1] => [-1,1] return [-1,1]
    [-4,-2,-1,0,1,2,3,4]  => [-4,4] first pair
    [1,2,3] => not false
*/

public class FindPairSumIsZero {

    private static final String sumZero(int arr[]) {

        if (arr[0] > 0) {
            return "none";
        }

        int beginIndex = 0;
        int endIndex = arr.length - 1;

        while (beginIndex < endIndex) {
            int sum = arr[beginIndex] + arr[endIndex];
            if (sum == 0) {
                return "[" + arr[beginIndex] + "," + arr[endIndex] + "]";
            } else {
                if (sum > 0) { //move left
                    endIndex--;
                } else {
                    beginIndex++; //proceed towards right
                }
            }
        }
        return "none";
    }

    public static void main(String[] args) {

        System.out.println(sumZero(new int[]{1, 2, 3})); //prints none
        System.out.println(sumZero(new int[]{-2, -1, 0, 2, 3})); //prints [-2,2]
    }
}
