package sorting;

import java.util.Arrays;

public class closest0s1s2s {
    public static void segragate012(int arr[], int N){
        int count_zero = 0;
        int count_one = 0;
        int count_two = 0;


        for(int i=0;i<N;i++){
            if(arr[i]==0){
                count_zero++;
            }
            else if(arr[i]==1){
                count_one++;
            }
            else if(arr[i]==2){
                count_two++;
            }
        }

        int counter = 0;

        for(int i=0;i<count_zero;i++){
            arr[counter++] = 0;
        }

        for(int j=0;j<count_one;j++){
            arr[counter++] = 1;
        }

        for(int k=0;k<count_two;k++){
            arr[counter++] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        segragate012(new int[]{0, 2, 1, 2, 0},5);
    }

}

/*OUTPUT

Input: N = 5, arr[] = {0, 2, 1, 2, 0}
Output: 0 0 1 2 2

* */
