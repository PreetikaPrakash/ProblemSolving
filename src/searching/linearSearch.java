// Time Complexity
// Worst Case = O(N)

// Space Complexity
// Worst Case = O(1)

/*
INPUT
{12,14,32,56,44} , KEY = 56
{1,2,3,7,4} , KEY = 8
{1,2,3,3,4} , KEY = 4
 */

package searching;
public class linearSearch {

    public static int linear(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1= new int[]{12,14,32,56,44};
        int[] arr2= new int[]{1,2,3,7,4};
        int[] arr3= new int[]{1,2,3,3,4};

        System.out.println(linear(arr1,56)); // 4
        System.out.println(linear(arr2,8)); // -1
        System.out.println(linear(arr3,4)); // 5

    }
}
