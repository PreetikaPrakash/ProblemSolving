package searching;

public class floorOfElementSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,10,10,12,19};
        int element = 5;
        int start = 0;
        int end = arr.length-1;
        floorOfElementSortedArray fa = new floorOfElementSortedArray();
        int result = fa.findfloorElement(arr,element,start,end);
        System.out.println("Floor of 5 is "+ result);
    }

    private int findfloorElement(int[] arr, int element, int start, int end) {
        int res = 0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid-1]>=start && arr[mid-1]<arr[mid]&&arr[mid]<element){
                res = arr[mid];
            }
            if(arr[mid]>=element){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}
//OUTPUT : Floor of 5 is 4
