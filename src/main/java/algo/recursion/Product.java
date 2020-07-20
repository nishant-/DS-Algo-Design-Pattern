package algo.recursion;

/*Given an array of integers find the product recursively*/

public class Product {

    private static final long product(int arr[]) {

        if (arr.length == 1)
            return arr[0];

        int begin = 0;
        int end = arr.length - 1;

        return calculate(arr, begin, end);


    }

    private static final long calculate(int arr[], int begin, int end) {

        if (begin == end - 1) {
            return arr[begin] * arr[end];
        }
        return arr[begin] * calculate(arr, begin + 1, end);

    }

    public static void main(String[] args) {
        System.out.println(product(new int[]{1, 2, 3, 4, 5}));
    }
}
