package hashing;

import java.util.Arrays;

public class unionOftwoArrays {
    public static int unionArrays(int[] arr1,int[] arr2, int n, int m) {

        // find maximum length of hash table
        int max1 = 0;
        int max2 = 0;
        int final_max = 0;
        for(int i=0;i<n;i++){
            if(arr1[i]>max1){
                max1 = arr1[i];
            }
        }
        for(int i=0;i<m;i++){
            if(arr2[i]>max2){
                max2 = arr2[i];
            }
        }
        if(max1>max2){final_max=max1;}
        else{final_max=max2;}
        int[] HT = new int[final_max+1];

        // iterate through n, store in hash
        for(int i=0;i<n;i++){
            HT[arr1[i]]++;
        }
        // iterate through m, store in hash
        for(int i=0;i<m;i++){
            HT[arr2[i]]++;
        }
        // iterate through hashtable, count all which are > 1
        int count = 0;
        for(int i=0;i< HT.length;i++){
            if (HT[i]>0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr1 ={89, 24, 1, 32, 54, 6, 89, 1, 32, 89};
        int[] arr2 ={89, 2};
        System.out.println(unionArrays(arr1,arr2,arr1.length,arr2.length));
        // output - 7(89,24,1,32,54,6,2)
    }
}
