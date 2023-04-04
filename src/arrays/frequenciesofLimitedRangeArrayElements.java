package arrays;

import java.util.Arrays;

// A can have or not have values of P
// A also can have other values
// P values in A can be repeated
// frequency of all values of P in A
// values grater than N can we ignored // P =7, N=5
// space = O(1)
//Given an array A[] of N positive integers which can contain integers from
// 1 to P where elements can be repeated or can be absent from the array.
// Your task is to count the frequency of all elements from 1 to N.
//Note: The elements greater than N in the array can be ignored for
// counting and please read your task section of the problem carefully to
// understand how to output the array.
public class frequenciesofLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P)
    {
        int temp_store=-1;
        for(int i=1;i<=P;i++){
            int count = 0;

            for(int j=0;j<N;j++){

                if(i==arr[j]){
                    count++;
                }
            }
            if(i==temp_store){
                count++;
            }
            if(arr[i-1]!=i){

                temp_store = arr[i-1];
                arr[i-1] = count;
//                System.out.println(Arrays.toString(arr));
            }

        }

    }
    public static void main(String[] args) {
        frequencyCount(new int[]{2, 3, 2, 3, 5},5,5);// P values in A can be repeated
//        frequencyCount(new int[]{2, 3, 2, 3, 5},5,7);
//        frequencyCount(new int[]{2, 3, 2, 3, 7},5,7);
//        frequencyCount(new int[]{2, 3, 2, 3, 5},5,3);
//        frequencyCount(new int[]{5, 8, 9, 7, 8},5,3);// A can have or not have values of P // A also can have other values
//        frequencyCount(new int[]{2, 3, 2, 3, 5,6,7},7,5); // values grater than N can we ignored // P =7, N=5
//        frequencyCount(new int[]{2, 3, 2, 3, 5,5,5},7,5);
    }
}
