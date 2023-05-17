package hashing;

import java.util.Arrays;

public class numberHashing {
    public static int findmax(int[] arr,int n){
        int s=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>s){
                s=arr[i];
            }
        }
        return s;
    }
    public static void numHash(int[] arr,int n){

        int max = findmax(arr,n);
        int[] hashh = new int[max+1];
        for(int i=0;i<n;i++){
            hashh[arr[i]]++;
        }
        System.out.println(Arrays.toString(hashh));
        // Output [0, 2, 1, 2, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1]

        // hashing to sort the array
        int i =0;
        for(int j=0;j<=max;j++) {
            while (hashh[j] > 0) {
                arr[i++] = j;
                hashh[j]--;
            }
        }
        System.out.println(Arrays.toString(arr));
        // Output [1, 1, 2, 3, 3, 4, 5, 12, 15]

    }

    public static void main(String[] args){
        int[] arr = {2,3,1,4,3,1,5,15,12};
        numHash(arr,arr.length);
    }
}
