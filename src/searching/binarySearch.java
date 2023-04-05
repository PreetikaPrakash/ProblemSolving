package searching;
// Iterative binary search is better than recursive binary search becuase of less auxillary space
// Time Complexity = O(logn)
// Space Complexity = O(1)
// arr = {10,20,30,40,50,60,70,80,90,100}
// iterative approach
public class binarySearch {
    public int checkArr(int[] arr, int x, int l, int r){
        while(l<r) {
            int mid = ((l + r) / 2);
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else if (arr[mid] > x) {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        binarySearch bs = new binarySearch();
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int l = arr[0];
        int r = arr[arr.length-1];
        int result = bs.checkArr(arr,25,0,arr.length);
        System.out.println(result);
    }
}
// check for 40 -> 3
// check for 25 -> -1
