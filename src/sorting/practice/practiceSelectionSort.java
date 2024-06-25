package sorting.practice;

import java.util.Arrays;

public class practiceSelectionSort {

    public static void main(String args[]){

        int arr[] = {10,5,8,20,2,18};
        int n = arr.length;
        int minElementIndex = 0;
        int temp = 0;

        for(int i=0;i<n;i++){
            minElementIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minElementIndex]){
                    minElementIndex = j;
                }
            }
            if(minElementIndex!= i){
            temp = arr[i];
            arr[i] = arr[minElementIndex];
            arr[minElementIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
