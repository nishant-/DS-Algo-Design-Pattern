package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandiesTest {

    @Test
    public void candies() {

        int arr[] = new int[100000];
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                arr[i] = 100002;
            }
            else {
                arr[i] = 100000;
            }
        }
        long x = Candies.candies(8, new int[] {2,9,8,6,4,3,2,1});
        System.out.println(x);

    }
}