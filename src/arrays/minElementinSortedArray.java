package arrays;

public class minElementinSortedArray {
    static int findMin(int arr[], int n)
    {
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            // observation 1 : if left to mid is greater return mid.
            if(mid == 0 || arr[mid-1]>arr[mid]){
                return arr[mid];
            }
            // observation 2 : if leftmost element of array is greater than mid, this left part is unsorted and is having our element.
            if(arr[low]>arr[mid]){
                high = mid - 1;
            }
            // observation 3 : if rightmost element of array is smaller than mid, this right part is unsorted and is having our element.
            else if(arr[high]<arr[mid]){
                low = mid + 1;
            }
            // observation 4 : if array is already sorted, means leftmost element is smallest.
            else{
                return arr[low];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 5, 7};
        int n = 7;
        System.out.println(findMin(arr,n));
    }
}

// OUTPUT
//5
