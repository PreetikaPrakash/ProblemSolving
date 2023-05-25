package searching;

public class count1sbinaryOptimized {

    public static int countOnesoptimized(int arr[], int N){
        int low  = 0;
        int high = N-1;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==1){
                if(mid == N-1 || arr[mid+1]==0){
                    return mid+1;
                }
                else {
                    low = mid + 1;
                }
            }
            else{
                high = mid -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,1,1,1,1,1,1,1};// 8
        int[] arr2 = new int[]{1,1,1,1,1,1,0,0};// 6
        int[] arr3 = new int[]{1,1,1,0,0,0,0,0};// 3
        int[] arr4 = new int[]{1,1,0,0,0,0,0,0};// 2
        int[] arr5 = new int[]{1,1,1,1,0,0,0,0};//4
        System.out.println(countOnesoptimized(arr1, arr1.length));
        System.out.println(countOnesoptimized(arr2, arr2.length));
        System.out.println(countOnesoptimized(arr3, arr3.length));
        System.out.println(countOnesoptimized(arr4, arr4.length));
        System.out.println(countOnesoptimized(arr5, arr5.length));

    }
}
