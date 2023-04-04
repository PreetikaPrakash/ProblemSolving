package searching;
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
        int result = bs.checkArr(arr,40,0,arr.length);
        System.out.println(result);
    }
}
