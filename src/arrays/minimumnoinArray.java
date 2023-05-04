package arrays;

import java.util.Arrays;

public class minimumnoinArray {

    static void bubbleSort(int[] array, int n) {

        for(int j=0;j<n-1;j++){
            int temp = 0;
            for (int i = 0; i < n-2; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static int MissingNumber(int array[], int n) {

        bubbleSort(array,n);
        int position=0;
        int new_pos=0;
        if(n==2){
            if(array[0]==1){return 2;}
            else{return 1;}
        }
        else{
            for(int i=0;i<n-2;i++){
                if(array[i]!=(array[i+1]-1)){
                    position = array[i]+1;
                    return position;
                }
                else{continue;}

            }
        }
        return array[n-2]+1;
    }
    public static void main(String[] args) {
        //int res = minimumnoinArray.MissingNumber(new int[]{6,1,2,8,3,4,7,10,5},10); // OP-> 9
        int res = minimumnoinArray.MissingNumber(new int[]{1,2,3,4},5); // OP->5
        System.out.println(res);

    }
}
