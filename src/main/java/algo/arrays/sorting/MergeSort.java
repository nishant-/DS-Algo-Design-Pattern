package algo.arrays.sorting;



public class MergeSort {

    public  void merge(int arr[], int p, int q, int r){

        int n1 = q-p+1; //left subarray will have mid-(start)+1 elements, p = start, q = mid, r=end
        int n2 = r-q; //right subarray will have last-mid elements
        int left[] = new int[n1+1];
        int right[] = new int[n2+1];
        //copyToTargetArray(startPosOfInput,numberOfItemsToBeCopied,inputArray,targetArray);
        copyToTargetArray(p,n1,arr,left);//copy to left subarray
        copyToTargetArray(q+1,n2,arr,right);//copy to right subarray
        int i=0;int j=0;
        //assuming left and right subarrays are sorted,
        //merge them into the main array
        for(int k=p;k<=r;k++){
            arr[k]= left[i]>right[j] ? right[j++]:left[i++];//smaller one goes in the main array
        }
    }

    private void copyToTargetArray(int startPosOfInput, int numberOfItemsToBeCopied, int[] inputArray, int[] targetArray) {
        for(int i=0;i<numberOfItemsToBeCopied;i++){
            targetArray[i]=inputArray[startPosOfInput+i];
        }
        //set sentinel value
        targetArray[numberOfItemsToBeCopied] = Integer.MAX_VALUE;
    }

    public void sort(int arr[], int p, int r)
    {
        if(p<r)
        {
            int q = (p+r)/2;
            sort(arr, p, q);
            sort(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }
}
