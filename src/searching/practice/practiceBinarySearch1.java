package searching.practice;

public class practiceBinarySearch1 {

    public int doBinarySearch(int arr[],int l, int h, int ele){
        int mid=0;
        while(l<=h){
            mid = l + (h-l)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                l=mid+1;
            }
            else if(arr[mid]>ele){
                h=mid-1;
            }
        }
        return -1; // if element is not found in the array
    }

    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int element = 70;
        int low = 0;
        int high = arr.length-1;
        practiceBinarySearch1 pbs = new practiceBinarySearch1();
        int result = pbs.doBinarySearch(arr,low,high,element);
        System.out.println("Element is found at index "+result);

    }

}
