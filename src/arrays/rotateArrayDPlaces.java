package arrays;
// {1,2,3,4,5} D=2 -> {3,4,5,1,2}
// APPROACH 1 - (left rotate by 1 place)* D times -> TC=O(n*d), Space= O(1)
// APPROACH 2 - In one array keep elements till D position, In another array keep elements from D to last and shift there places by -D now add elements of array one to this second array -> TC(O(n)) SP = O(d)
// APPROACH 3 - Best Approach -> Recursion -> 3 steps-> Step1= reverse elements till D position -> Step2= reverse elements from D to n-1 position -> Step3 = now reverse the complete array. -> TC=O(n), SP=O(1)

public class rotateArrayDPlaces {

    static void rotateArr(int arr[], int d, int n) {

        d=d%n; // for reducing time // only for online IDE // so that after every n-1 rotations we will reach the same array as before
        //Perform d%n in order to keep the value of d within the range of the array where d is the number of times the array is rotated and N is the size of the array.

        reverseArray(arr, 0, d - 1); // 1,2,3,4,5,6, D =2
        printArray(arr);
        reverseArray(arr, d, n - 1); // 1,2,3,4,5,6, D =2
        printArray(arr);
        reverseArray(arr, 0, n - 1); // 1,2,3,4,5,6, D =2
        printArray(arr);
    }

    static void reverseArray(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
//            int arr[] = new int[]{1,2,3,4,5};
//            int D = 2;
//            rotateArr(arr,D,5);

        int arr2[] = new int[]{40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};

        rotateArr(arr2, 69, 77);
    }
}

