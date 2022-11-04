package arrays;
/*
Return true if 1st index and last index is equal
 */
public class firstLastEqual {

    private static boolean equalFirstLast(int[] arr){
        if(arr[0] == arr[arr.length-1]){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int arr1[] = {1, 2, 6};
        int arr2[] = {6, 1, 2, 6};
        int arr3[] = {13};
        System.out.println(equalFirstLast(arr1));
        System.out.println(equalFirstLast(arr2));
        System.out.println(equalFirstLast(arr3));
    }

}
