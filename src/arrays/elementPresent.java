package arrays;
/*
Return true if 6 present at 1st or last index
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */

public class elementPresent {

    private static boolean PresentOrNot(int[] arr){
        if(arr[0]==6 || arr[arr.length-1]==6){
            return true;
        }
    return false;
    }
    public static void main(String[] args){
        int arr1[] = {1, 2, 6};
        int arr2[] = {6, 1, 2, 3};
        int arr3[] = {13, 6, 1, 2, 3};
        int arr4[] = {13};
        int arr5[] = {6};
        System.out.println(PresentOrNot(arr1));
        System.out.println(PresentOrNot(arr2));
        System.out.println(PresentOrNot(arr3));
        System.out.println(PresentOrNot(arr4));
        System.out.println(PresentOrNot(arr5));
    }

}
