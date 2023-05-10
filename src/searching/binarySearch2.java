/*
In binary search list needs to be sorted.
ITERATIVE APPROACH

TIME COMPLEXITY = O(logn)
SPACE COMPLEXITY = The space complexity of the code is O(1) since it only uses a constant amount of extra space to store the variables low, high, mid, and key.(answered by chatGPT)

INPUT
{12,56,34,89,56,21,33,42,90,21,43}, Key =21
{12,56,34,89,56,21,33,42,90,21,43}, Key =11

 */
package searching;

import java.util.Arrays;

public class binarySearch2 {

    public static int binary2(int[] arr, int key){
        int low = 0;
        int high = arr.length;
        int mid = 0;
        while(low<high){
            mid = (low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                high = mid-1;
            }
            else if(key>arr[mid]){
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1= new int[]{12,14,32,56,44};
        Arrays.sort(arr1);
        int[] arr2= new int[]{12,56,34,89,56,21,33,42,90,21,43};
        Arrays.sort(arr2);

        System.out.println(binary2(arr1,56)); // 4
        System.out.println(binary2(arr2,21)); // 2
        System.out.println(binary2(arr2,11)); // -1
    }
}
