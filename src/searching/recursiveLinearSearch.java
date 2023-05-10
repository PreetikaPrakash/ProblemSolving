// Time Complexity
// Worst Case = O(N)

// Space Complexity
// Worst Case = O(N)

/*
INPUT
size = 5
 0  1  2  3  4
{12,14,32,56,44} , KEY = 56
{1,2,3,7,4} , KEY = 8
{1,2,3,3,4} , KEY = 4
 */

/*
check from right element to first element
Base Condition - if array size is zero
 */

package searching;
public class recursiveLinearSearch {
    public static int linear(int[] arr, int size ,int key){
        if(size==0){
            return -1;
        }
        else if(arr[size-1]==key){
            return size;
        }
        else{
            return linear(arr,size-1,key);
        }
    }

    public static void main(String[] args) {
        int[] arr1= new int[]{12,14,32,56,44};
        int[] arr2= new int[]{1,2,3,7,4};
        int[] arr3= new int[]{1,2,3,3,4};

        System.out.println(linear(arr1,arr1.length,56)); // 4
        System.out.println(linear(arr2,arr2.length,8)); // -1
        System.out.println(linear(arr3,arr3.length,4)); // 5

    }
}
