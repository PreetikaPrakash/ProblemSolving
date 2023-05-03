/*
Divide and Conquer - Recursive function
A[] = {9,3,7,5,6,4,8,2}
low = first index
high = last index

Algorithm MergeSort(array,low,high):
    if(low<=high)
        mid=low+high/2
        MergeSort(array,low, mid);
        MergeSort(array,mid+1,high);
        Merge(array, low,high,mid);
*/
package sorting;
import java.util.Arrays;
public class mergeSort {

    int low;
    int high;

    public void Merge(int[] arr, int low, int high,int mid){
        //int[] newarr = new int[arr.length];
        //int k=0; // pointer for the above new array in whihc
        // left sorted array part -> low - mid
        // right sorted array part -> mid+1 - high

        int left = low; // pointer for left array part placed at beginning
        int left_end = mid; // placed at end of array
        int right = mid+1; // pointer for right array part placed at beginning
        int right_end = high; // placed at end of array

        while(left<left_end && right<right_end){
            // suppose we are at the bottom of the tree and only two values 3,2 are present in array. Now, these two values will the help of merge function have to be compared.
            if(arr[left]>arr[right]){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left]=temp;
            }
        }
       // System.out.println(Arrays.toString(arr));

    }

    public void MergeSort(int[] arr, int low, int high){
        if(low<high){
            return;
        }
        else{
            int mid = (low+high)/2;
            MergeSort(arr,low,mid);
            MergeSort(arr,mid+1,high);
            Merge(arr,low,high,mid);
        }

    }

    public static void main(String args[]){
        mergeSort ms = new mergeSort();
        //int[] arr= {9,3,7,5,6,4,8,2};
        int[] arr= {3,2};
        ms.MergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
