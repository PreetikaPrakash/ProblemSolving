// Time Complexity : O(n)
// Space Complexity : O(n)
package sorting;

import java.util.Arrays;

public class countSort {
    private static int findMax(int[] arr, int n){
        int m = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    private static void funccountsort(int[] arr, int n){
        int max = findMax(arr,n);
        int[] count = new int[max+1];
        Arrays.fill(count,0);

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int k=0;
        int j=0;
        while(k<max+1){
            if(count[k]>0){
                arr[j++]=k;
                count[k]--;
            }
            else{
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,10,15,6,8,12,3,6};
        funccountsort(arr,arr.length);
    }

}
