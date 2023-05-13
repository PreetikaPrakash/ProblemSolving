package searching;

public class count1sinBinaryArray {

    public static int countOnes(int arr[], int N){
        int low  = 0;
        int mid = (low + N)/2;
        if(arr[mid]==0){
            if(arr[mid+1]!=0){
                return (N-(mid+1));
            }
            else{
                while(arr[mid+1]==0 && mid+1<=N){
                    mid = mid + 1;
                }
                return (N-(mid+1));
            }
        }
        if(arr[mid]==1){
            if(arr[mid-1]!=1){
                return N-mid;
            }
            else{
                while(arr[mid-1]==1 && mid-1>0){
                    mid = mid - 1;
                }
                return N-mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,1,1,1,1,1,1,1};// 8
        int[] arr2 = new int[]{0,0,1,1,1,1,1,1};// 6
        int[] arr3 = new int[]{0,0,0,0,0,1,1,1};// 3
        int[] arr4 = new int[]{0,0,0,0,0,0,1,1};// 2
        int[] arr5 = new int[]{0,0,0,0,1,1,1,1};//4
        System.out.println(countOnes(arr3, arr3.length));
        System.out.println(countOnes(arr4, arr4.length));
        System.out.println(countOnes(arr5, arr5.length));
        System.out.println(countOnes(arr1, arr1.length));
        System.out.println(countOnes(arr2, arr2.length));
    }
}
