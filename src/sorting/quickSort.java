// Time Complexity: O(nlogn)
package sorting;

import java.util.Arrays;

public class quickSort {
    public static int partition(int arr[],int l, int h){
        int i = l;
        int j = h;
        int pivot = arr[l];
        do{
            do{i++;}while(arr[i]<=pivot);
            do{j--;}while(arr[j]>pivot);

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while(i<j);

        int temp2 = arr[l];
        arr[l] = arr[j];
        arr[j] = temp2;
        return j;

    }
    public static void funquicksort(int arr[],int l,int h){
        int j;
        if(l<h){
            j = partition(arr,l,h);
            funquicksort(arr,0,j);
            funquicksort(arr,j+1,h);
        }
    }
    public static void main(String[] args) {
        int INT_MAX = Integer.MAX_VALUE;
        System.out.println(INT_MAX);
        int arr[] = {2,1,6,10,4,1,3,9,7,INT_MAX};
        //int arr[] = {11,13,7,12,16,9,24,5,10,3,INT_MAX};
        funquicksort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }


}

// OUTPUT
//2147483647
// [1, 1, 2, 3, 4, 6, 7, 9, 10, 2147483647]