/*
In binary search list needs to be sorted.
RECURSIVE APPROACH

TIME COMPLEXITY = O(logn)
SPACE COMPLEXITY = O(logn) -> The space complexity of the recursive binary search algorithm is O(log n)
since it involves a recursive function that splits the array into smaller
subarrays with each recursive call. At any point in time,
there will be at most log n recursive calls on the call stack,
where n is the size of the input array. Therefore, the space required for the call
stack is proportional to log n.(answered by chatgpt)

INPUT
{12,56,34,89,56,21,33,42,90,21,43}, Key =21
{12,56,34,89,56,21,33,42,90,21,43}, Key =11

 */
package searching;

import java.util.Arrays;

public class recursivebinarysearch2 {

    public static int binary2(int[] arr, int low, int high ,int key){
        int mid = (low+ high)/2;
        if(arr[mid]==key){
            return mid+1;
        }
        if(low>high) {
            return -1;
        } else if(arr[mid]<key){
            return binary2(arr,mid+1,high,key);
        }
        else
        {
            return binary2(arr,low, mid-1,key);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] arr2= new int[]{12,56,34,89,56,21,33,42,90,21,43};
        Arrays.sort(arr2);

        System.out.println(binary2(arr1,0, arr1.length, 70)); // 7
        System.out.println(binary2(arr2,0, arr2.length, 21)); // 3
        System.out.println(binary2(arr2,0, arr2.length, 11)); // -1
    }
}
