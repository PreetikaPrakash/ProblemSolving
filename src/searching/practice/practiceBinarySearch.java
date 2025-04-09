package searching.practice;

import java.util.Arrays;

public class practiceBinarySearch {
    public static int binarysearchfunc(int[] arr,int searchElement,int start,int end){
        int mid = 0;
        // Step 5: do this till start < = end
        while(start<=end) {
            // Step 1 : find the mid
            mid = (start+end) / 2;
            // Step 2 : check if mid has the required element
            if (arr[mid] == searchElement) {
                return mid;
            }
            // Step 3: check if required element is greater than mid element - remove array left half
            else if (searchElement > arr[mid]) {
                start = mid + 1;
            }
            // Step 4 : check if required element is less than mid element - remove array right half
            else if (searchElement < arr[mid]) {
                end = mid - 1;
            }
        }
        // Step 6: if nothing is found return -1
        return -1;

    }
    public static void main(String[] args) {
        System.out.println("If you see this, IntelliJ is working.");
        int[] arr = new int[]{100,110,140,190,230,270,300,320};
        int searchElement = 230;
        int l = 0;
        int r = arr.length-1;
        int elementfoundAt = binarysearchfunc(arr,searchElement,l,r);
        System.out.println("Hello");
        System.out.println("Element is present at index "+ elementfoundAt);
    }
}