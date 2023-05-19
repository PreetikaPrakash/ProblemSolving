package hashing;

import java.util.Arrays;

public class countNonRepeatedElements {
    static long countNonRepeated(int arr[], int n)
    {
        int max = 0;
        // find the max element, hashtable size will be size of max element.
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int[] HT = new int[max+1];

        for(int j=0;j<n;j++){
            HT[arr[j]]++;
        }
        System.out.println(Arrays.toString(HT));
        // output -> [0, 2, 2, 2, 1, 1, 1, 1]

        long count =0;
        for(int k=0;k<max+1;k++){
            if(HT[k]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,3,4,5,6,7};
        System.out.println(countNonRepeated(arr,arr.length));
        // output - 4

    }
}
