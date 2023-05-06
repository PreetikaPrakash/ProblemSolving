package arrays;

import java.util.Arrays;

public class alternatePositiveandNegativeNumbers {

    static void rearrange(int arr[], int n) {
                int arr2[] = new int[n];
                int arr3[] = new int[n];
                int j=0;
                int k=0;
                for(int i=0;i<n;i++){
                    if(arr[i]>=0){
                        arr2[j++]=arr[i];
                    }
                    else{
                        arr3[k++]=arr[i];
                    }
                }
                j=0;
                for(int i=0;i<n-1;i++){
                    arr[i++]=arr2[j];
                    arr[i]=arr3[j++];
                }
                System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        rearrange(new int[]{9, 4, -2, -1, 5, 0, -5, -3, 2},9);
        rearrange(new int[]{-9, 4, -2, -1, 5, 0, -5, -3, 2},9);
    }
}
