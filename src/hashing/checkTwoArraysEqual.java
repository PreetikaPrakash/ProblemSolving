package hashing;

import java.util.Arrays;

public class checkTwoArraysEqual {
    public static boolean checkTwoArraysEqual(int[] A,int[] B, int N) {

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++){
            if(A[i]==B[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 ={1,2,5,4,0,2};
        int[] arr2 ={2,4,5,0,1,2};
        System.out.println(checkTwoArraysEqual(arr1,arr2,arr1.length));
        // output - 1
    }
}
