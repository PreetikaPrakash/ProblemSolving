package searching;

public class searchingNearlySortedArray {
    public static void main(String[] args) {
        int arr[] = {5,10,30,20,40};
        int element = 20;
        int start = 0;
        int end = arr.length-1;
        searchingNearlySortedArray fa = new searchingNearlySortedArray();
        int result = fa.findNearlysortedArray(arr,element,start,end);
        System.out.println("Element was found at index "+ result);
    }

    private int findNearlysortedArray(int[] arr, int element, int start, int end) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==element){
                return mid;
            }
            if((mid-1)>=start && arr[mid-1]==element){
                return mid-1;
            }
            if((mid+1)<=end && arr[mid+1]==element){
                return mid+1;
            }
            if(arr[mid]>element){
                end = mid-2;
            }
            else{
                start = mid+2;
            }
        }
        return -1 ;
    }
}
//OUTPUT : Element was found at index 3