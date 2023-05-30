package searching;

import java.util.Arrays;

public class countMorethanNKOccurences {
    public static int countoccurences(int[] arr, int n, int k){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] hash_arr = new int[max+1];

        for(int i=0;i<n;i++){
            hash_arr[arr[i]]++;
        }
        System.out.println(Arrays.toString(hash_arr));
        int count =0;
        int div = n/k;
        for(int i=0;i<hash_arr.length;i++){
            if(hash_arr[i]>div){count++;}
        }
    return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,1,2,2,1,2,3,3};
        int n1 = arr1.length;
        int k1 = 4;
        System.out.println(countoccurences(arr1,n1, k1));
        int[] arr2 =  {2,3,3,2};
        int n2 = arr2.length;
        int k2 = 3;
        System.out.println(countoccurences(arr2,n2, k2));
    }
}
/*
OUTPUT
[0, 2, 3, 3]
2
[0, 0, 2, 2]
2
* */
