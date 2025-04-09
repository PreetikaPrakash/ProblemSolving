package searching.practice;

public class practiceBinarySearchRecursive {
    public static int binarysearchRecursivefunc(int arr[], int start,int end,int element){
        int mid = (start+end)/2;
        if(start<=end){
            if(arr[mid]==element){
                return mid;
            }
            if(arr[mid]<element){
                return binarysearchRecursivefunc(arr,mid+1,end,element);
            }
            else{
                return binarysearchRecursivefunc(arr,start,mid-1,element);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{100,110,140,190,230,270,300,320};
        int searchElement = 320;
        int l = 0;
        int r = arr.length-1;
        int elementfoundAt = binarysearchRecursivefunc(arr,l,r,searchElement);
        System.out.println("Your Element is present at index "+ elementfoundAt);
    }
}
