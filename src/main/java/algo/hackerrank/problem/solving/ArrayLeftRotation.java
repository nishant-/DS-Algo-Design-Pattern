package algo.hackerrank.problem.solving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayLeftRotation {



    public static int[] leftRotate(int d, int arr[]) {

        d = d % arr.length;

        if (d == 0) {
            return arr;
        }

        int t[] = new int[arr.length];


        int c = 0;
        for(int j = d; j < arr.length; j++) {
            t[c++] = arr[j];
        }

        for(int j = 0; j < d; j++) {
            t[c++] = arr[j];
        }

        return t;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();

        int arr[] = leftRotate(d, a);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                sb.append(arr[i]);
            }
            else {
                sb.append(arr[i] + " ");
            }
        }
        System.out.println(sb.toString());
    }
}
