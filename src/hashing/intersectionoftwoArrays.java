package hashing;

import java.util.Arrays;

public class intersectionoftwoArrays {
    public static int intersectionRepeated(int[] arr1,int[] arr2, int n, int m) {
        int max1 = 0;
        int max2 = 0;
        int final_max = 0;
        // find the max element, hashtable size will be size of max element.
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

        System.out.println(final_max);
        int[] HT = new int[final_max+1];

        for(int j=0;j<n;j++){
            HT[arr1[j]]++;
        }
        /*for(int j=0;j<m;j++){
            HT[arr2[j]]++;
        }
        System.out.println(Arrays.toString(HT));
        // output -> [0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2]
        */
        int count =0;
        /*for(int k=0;k<n;k++){
            if(HT[arr1[k]]>=2){
                count++;
            }
        }*/
        for(int j=0;j<m;j++){
            if(HT[arr2[j]]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 ={89, 24, 75, 11, 23};
        int[] arr2 ={89, 2, 4};
        System.out.println(intersectionRepeated(arr1,arr2,arr1.length,arr2.length));
        // output - 1(89)

    }
}
