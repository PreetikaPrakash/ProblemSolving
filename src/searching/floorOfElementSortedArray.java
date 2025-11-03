package searching;

public class floorCeilOfElementSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,10,10,12,19};
        int element = 5;
        int start = 0;
        int end = arr.length-1;
        floorCeilOfElementSortedArray fa = new floorCeilOfElementSortedArray();
        int result = fa.findfloorElement(arr,element,start,end);
        int result2 = fa.findceilElement(arr,9,start,end);
        System.out.println("Floor of 5 is "+ result);
        System.out.println("Ceil of 9 is "+ result2);
    }

    private int findceilElement(int[] arr, int element, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if((mid+1)<=end &&arr[mid]>element){
                return arr[mid];
            }
            if(arr[mid]<element){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    private int findfloorElement(int[] arr, int element, int start, int end) {
        int res = 0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((mid-1)>=start && arr[mid-1]<arr[mid]&&arr[mid]<element){
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
//OUTPUT :
// Floor of 5 is 4
// Ceil of 9 is 10