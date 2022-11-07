package arrays;
import java.util.Arrays;
import java.util.List;

/*
methods used
1.asList() - returns object of List type
2.binarySearch()
3.compare(arr1,arr2) - compares lexicographically
4.copyOf(Originalarray, new length)
5.equals(arr1,arr2) - returns boolean
6.fill(originalarray,fillValue) - assign this fill value to each index of array, changes existing array
7.sort(originalArray) - in ascending order, changes existing array
8.toString(originalArray) - returns string representation of the array contents in one line.
*/
public class arrayClassMethods {
    public static void method_asList(int[] arr){
        List ls = Arrays.asList(arr);
        System.out.println(ls);
    }
    public static void method_binarySearch(int[] arr, int key){
        int keys = Arrays.binarySearch(arr,key);
        System.out.println(keys);
    }
    public static void method_compare(int[] arr1,int[] arr2){
        int arr3[] ={2,3,4,5};
        System.out.println(Arrays.compare(arr1,arr2)); // 0
        System.out.println(Arrays.compare(arr1,arr3)); // 1
        System.out.println(Arrays.compare(arr3,arr2)); // -1
    }
    public static void method_copyOf(int[] arr, int len){
        int arr1[] = Arrays.copyOf(arr,len);
        System.out.println(Arrays.toString(arr1));
    }
    public static void method_equals(int[] arr1,int[] arr2){
        int arr3[] = {2,3,4,5};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));
    }
    public static void method_fill(int arr1[],int fillvalue){
        Arrays.fill(arr1,fillvalue);
        System.out.println(Arrays.toString(arr1));
    }
    public static void method_sort(int arr1[]){
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    public static String method_toString(int arr[]){
        return Arrays.toString(arr);
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        method_asList(arr);
        method_binarySearch(arr,3);
        method_compare(arr,arr);
        method_copyOf(arr,10);
        method_equals(arr,arr);
        method_fill(arr,30);
        method_sort(new int[]{4,8,5,0});
        String str = method_toString(new int[]{4,4,4,4});
        System.out.println(str);


    }
}
