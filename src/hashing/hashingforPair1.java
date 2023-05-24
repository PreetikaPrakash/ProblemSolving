package hashing;

import java.util.Arrays;

public class hashingforPair1 {
    public static int sumExists(int arr[], int n, int sum){
    int max = 0;
    // find the max element, hashtable size will be size of max element.
        for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    int[] HT = new int[max+1];

    // store value to hashtable
        for(int j=0;j<n;j++){
        HT[arr[j]]++;
    }
        System.out.println(Arrays.toString(HT));

    int count =0;
        for(int k=0;k<n;k++){
        int result = sum - arr[k]; // 14-1 = 13 // 14-4=10
        if(result<=max){
            if(HT[Math.abs(result)]==1) {
                return 1;
            }
        }
    }
        return 0;
}
    public static void main(String[] args) {
        int[] arr ={74,65, 42, 12, 54, 69, 48, 45, 63, 58, 38, 60, 24, 30};
        int sum = 17;
        System.out.println(sumExists(arr,arr.length,sum));
        // output - 14

    }
}
