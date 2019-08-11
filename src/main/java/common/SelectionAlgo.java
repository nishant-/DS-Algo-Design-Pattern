package common;


import util.NumberUtility;

import java.util.concurrent.ThreadLocalRandom;

/**
 *  Given an array of integers
 *  find the kth largest item
 */
public class SelectionAlgo {

    private int arr[];

    public SelectionAlgo(int size) {
        this.arr = new int[size];
    }


    public static void main(String[] args) {

        SelectionAlgo selectionAlgo = new SelectionAlgo(10);
        selectionAlgo.fillArray();
        for (int x : selectionAlgo.arr) {
            System.out.print(x + ",");
        }
        System.out.println();
        selectionAlgo.partition(selectionAlgo.arr, 0, selectionAlgo.arr.length);
        for (int x : selectionAlgo.arr) {
            System.out.print(x + ",");
        }
    }

    public void fillArray() {
        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1,100);
        }
    }

    public void partition(int arr[], int p, int q) {

        int pivot = arr[q - 1];
        int i = p - 1;

        for(int j = 0; j < q-1; j++) {
            if(arr[j] <= pivot) {
                i++;
                NumberUtility.swap(arr, i, j);
            }
        }
        NumberUtility.swap(arr, i+1, q-1);
    }
}
