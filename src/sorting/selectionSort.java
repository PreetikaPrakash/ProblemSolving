// Time Complexity : O(n2)
// Space Complexity : O(1)
package sorting;

import java.util.Arrays;

public class selectionSort {
    public static void selection(int[] arr, int n){
        int k=0;
        for(int i=0;i<n-1;i++){ // n-1 because in last pass last element will already be sorted.
            k=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {8,5,3,1,9};
        selection(arr,arr.length);
    }
}
