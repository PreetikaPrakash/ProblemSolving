package searching;

public class countTimesSortedArrayisRotated {
    int countTimesofRotation(int arr[], int start,int end){
        // Step 1 : find out the mid element using binary search
            // compare the mid element with prev and next
            // if mid element is > prev and < next then it is the minimum element, return the minimum element
        int N = arr.length;
        while(start<=end){
            // subarray is already sorted
            if(arr[start]<=arr[end]){
                return start;
            }
            int mid = start + (end-start)/ 2;
            int prev = (mid+N-1)%N;
            int next = (mid+1)%N;
            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next]){
                return mid;
            }
                // Step 2 : if minimum element is not found at the mid position now where to move in the array
                // compare start with mid - if start < mid then left of mid is sorted else unsorted
                // compare end with mid - if end > mid then right of mid is sorted else unsorted
                // we have to search in unsorted array
            if (arr[mid] >= arr[start]){
                // search in right of array
                start = mid+1;
            }
            else {
                // search in left of array
                end = mid-1;
            }
            }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {11,12,15,18,2,5,6,8}; // Rotated Array
        int start = 0;
        int end = arr.length-1;
        countTimesSortedArrayisRotated cr = new countTimesSortedArrayisRotated();
        int minElementIndex = cr.countTimesofRotation(arr,start,end);
        System.out.println("Sorted array is rotated "+minElementIndex+" times");
    }

}
