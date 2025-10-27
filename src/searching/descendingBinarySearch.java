package searching;

public class descendingBinarySearch {

    public int doDescBinarySearch(int arr[],int ele,int start,int end){
        int mid = 0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                end = mid - 1;
            }
            else if(arr[mid]>ele){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {20,17,15,14,13,12,10,9,8,4};
        int element = 4;
        int l = 0;
        int h = arr.length-1;
        descendingBinarySearch dbs = new descendingBinarySearch();
        int result = dbs.doDescBinarySearch(arr,element,l,h);
        System.out.println("Element is found at index "+result);
    }

}
