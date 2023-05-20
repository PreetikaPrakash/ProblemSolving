package hashing;

import java.util.Arrays;

public class firstRepeatingElement {
    public static int firstRepeated(int[] arr, int n) {
        int max = 0;
        // find the max element, hashtable size will be size of max element.
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        int[] HT = new int[max+1];

        for(int j=0;j<n;j++){
            HT[arr[j]]++;
        }
        System.out.println(Arrays.toString(HT));
        // output -> [0, 1, 0, 2, 1, 2, 1]
        // output -> [1,1,1,0,3,2,0,1,2,1]

        int count =0;
        for(int k=0;k<n;k++){
            if(HT[arr[k]]>=2){
                return k+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //int[] arr ={1, 5, 3, 4, 3, 5, 6};
        int[] arr ={7,4,0,9,4,8,8,2,4,5,5,1};
        System.out.println(firstRepeated(arr,arr.length));
        // output - 2

    }
}
