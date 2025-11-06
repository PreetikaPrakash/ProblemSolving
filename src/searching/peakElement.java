package searching;

public class peakElement {
    public static void main(String[] args) {
        int arr[] = {10,20,15,2,23,90,67};
        int start = 0;
        int end = arr.length-1;
        peakElement pe = new peakElement();
        int result = pe.findPeakElement(arr,start,end);
        System.out.println("Return any of the Peak Element = "+result);
    }

    private int findPeakElement(int[] arr, int start, int end) {
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid-1]>arr[mid]){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
// OUTPUT : Return any of the Peak Element = 20