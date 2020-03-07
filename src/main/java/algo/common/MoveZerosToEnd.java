package algo.common;


/** Given an array containing zeros,
 * write a function which will move all zeros to the end of array */
public class MoveZerosToEnd {
    public void move(int[] arr) {

        int count = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }

        //copy the zeros

        for(int j = count ; j < arr.length ; j++) {
            arr[j] = 0;
        }

    }
}
