package arrays;

import java.util.Arrays;

public class cyclicRotateArray {

    // BRUTE FORCE
    public static void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        int arr2[]= new int[n];

        for(int i=0;i<n-1;i++){
            arr2[i+1]=arr[i];
            //arr2[1]=arr[0] => arr2[1]=1
            //arr2[2]=arr[1] => arr2[2]=2
            //arr2[3]=arr[2] => arr2[3]=3
            //arr2[4]=arr[3] => arr2[4]=4
        }
        arr2[0]=temp;
        //arr2[0]=5
        System.out.println(Arrays.toString(arr2));
    }

    // OPTIMIZED - O(n)
    // Rotating the same array arr wihtout using a new array
    public void rotateSameArray(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;


    }

    public static void main(String[] args) {
        cyclicRotateArray.rotate(new int[]{1,2,3,4,5},5);
    }
}


/*
OUTPUT
[5, 1, 2, 3, 4]
*/