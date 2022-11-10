package arrays;

import java.util.Arrays;

public class prefixSum {
    private static int prefix(int arr[], int A[]){
        int l = arr[0];
        int r = arr[1];

        // Compute sum of elements one by one while traversing through the complete array
        int sum[] = new int[A.length];
        sum[0]=A[0];
        int cal =A[0];
        for(int i=1;i<A.length;i++){
            cal = cal + A[i];
            sum[i] = cal;
        }
        if(l!=0) {
            return sum[r] - sum[l - 1];
        }
        else{
            return sum[r];
        }
    }


    public static void main(String[] args) {
        int A[]=new int[]{2,8,3,9,6,5,4};
        int query1[] = new int[]{0,2}; //13
        int query2[] = new int[]{1,3}; //20
        int query3[] = new int[]{2,6}; //27

        System.out.println(prefix(query1,A));
        System.out.println(prefix(query2,A));
        System.out.println(prefix(query3,A));
    }
}
