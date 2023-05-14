// Time Complexity : O(n2)
// Space Complexity : O(1)
package sorting;

import java.util.Arrays;

public class insertionSort {
    static void insert(int arr[],int i)
    {
        int key = arr[i];
        int j = i-1;
        while (j>=0 && key<arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1]=key;

    }
    public void insertionSortfunc(int arr[], int n)
    {
        for(int i=1;i<n;i++){
            insert(arr,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {20,8,15,33,2};
        insertionSort in = new insertionSort();
        in.insertionSortfunc(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
