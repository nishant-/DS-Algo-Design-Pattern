package algo.arrays.searching;

public class BinarySearch {

    public int searchRecursive(int arr[], int start, int end,int key){

        //compute mid;
        int mid = (start+end) >> 1;
        //return if indices cross over, it implies key not found
        if(end<start)
            return -1;
        if(arr[mid]==key) //element found
            return mid;
        if(arr[mid]>key) //the key is likely to be in the left half
            return searchRecursive(arr,start,mid-1,key);
        else
            return searchRecursive(arr,mid+1,end,key); //search the right half
    }

    public int searchIterative (int arr[], int start, int end, int key) {

        while(start<=end) {

            int mid = (start + end)/2;
            if(arr[mid]==key)
                return mid;//return position of element
            else if(arr[mid]>key) {
                //search left
                end = mid-1;
            }
            else if(arr[mid]<key) {
                //search right
                start = mid+1;
            }
        }
        return -1;

    }
}
