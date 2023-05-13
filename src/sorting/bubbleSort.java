// Time Complexity : O(n2)
package sorting;

import java.util.Arrays;

public class bubbleSort {
    private static int[] bubble(int[] arr,int n){
        boolean swapped = false;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if(swapped == false){break;} // rest of the list is already sorted at this point, in case of sorted list
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr2={24,18,38,43,14,40,1,54};
        int[] arr = bubble(arr2,arr2.length);
        System.out.println(Arrays.toString(arr));// [1, 14, 18, 24, 38, 40, 43, 54]
    }

}
