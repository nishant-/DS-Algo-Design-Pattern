package algo.arrays.searching;

public class LinearSearch<T> {

    public int find (T arr[], T key) {

        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals(key))
                return i;
        }

        return -1;
    }
}
