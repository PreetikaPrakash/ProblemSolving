package searching;
// Time Complexity = O(logn)
// Space Complexity = O(logn)
// arr = {10,20,30,40,50,60,70,80,90,100}
// recursive approach
public class recursiveBinarySearch {

    public int checkrecurArr(int[] arr, int x, int l, int r){
        int mid = (l + r)/2; // 5

        if(l>r){return -1;} // base condition in case element is not present

        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]<x){
            return checkrecurArr(arr,x,mid+1,r);
        }
        else{
            return checkrecurArr(arr,x,l,mid-1);
        }
    }

    public static void main(String[]args) {
        recursiveBinarySearch rbs = new recursiveBinarySearch();
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result = rbs.checkrecurArr(arr, 40, 0, arr.length);
        System.out.println(result);
    }
}
// check for 40 -> 3
// check for 25 -> -1

