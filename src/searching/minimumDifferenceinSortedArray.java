package searching;

public class minimumDifferenceinSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,3,8,10,15};
        int key = 12;
        int start = 0;
        int end = arr.length-1;
        minimumDifferenceinSortedArray md = new minimumDifferenceinSortedArray();
        int result = md.findtheIndex(arr,key,start,end);
        System.out.println("Minimum difference from the key was "+ result);

    }

    private int findtheIndex(int[] arr, int key, int start, int end) {
        while(start<=end){
            int mid = start + (end-start)/2;
            // if key is present in the array
            if(arr[mid]==key){
                return 0;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        int minleft = key-arr[end];
        int minright = arr[start]-key;
        if(minleft<minright){
            return minleft;
        }
        else{
            return minright;
        }
    }
}
//OUTPUT - Minimum difference from the key was 2
