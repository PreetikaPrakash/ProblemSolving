// Expected Time Complexity : O(n)
// My Time Complexity : O(n)
package sorting;

import java.util.Arrays;

public class binaryArraySorting {
    static void binSort(int arr[], int n)
    {
        int countzero=0;
        int countone=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                countzero++;
            }
            else{countone++;}
        }
        int j=0;
        for(j=0;j<countzero;j++){
            arr[j]=0;
        }
        for(int k=j;k<n;k++){
            arr[k]=1;
        }
    }

    public static void main(String[] args) {
        int[] arr2 = new int[] {1,0,1,1,1,1,1,0,0,0};
        binSort(arr2,10 );
        System.out.println(Arrays.toString(arr2)); // 0, 0, 0, 0, 1, 1, 1, 1, 1, 1

    }
}
