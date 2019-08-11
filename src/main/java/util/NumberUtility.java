package util;

public class NumberUtility {

    private NumberUtility(){}

    public static void swap(int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }



}
