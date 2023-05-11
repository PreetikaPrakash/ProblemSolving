package searching;

public class leftIndex {
    static int leftIndex(int N, int arr[], int X)
   {
        int low=0;
        int high = N-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<X){
                low = mid+1;
            }
            else if(arr[mid]>X){
                high = mid -1;
            }
            else {
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,4,5,5,6,7};
        int x =1;
        System.out.println(leftIndex(arr.length,arr,x));
    }
}
