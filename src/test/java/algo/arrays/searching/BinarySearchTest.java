package algo.arrays.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void searchRecursive() {
        int arr[] = new int[0];
        BinarySearch binarySearch = new BinarySearch();
        assertTrue(binarySearch.searchRecursive(arr,0,arr.length-1,1)==-1);
    }

    @Test
    void searchIterative() {
        int arr[] = new int[0];
        BinarySearch binarySearch = new BinarySearch();
        assertTrue(binarySearch.searchIterative(arr,0,arr.length-1,1)==-1);
    }
}