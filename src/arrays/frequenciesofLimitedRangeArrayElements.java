package arrays;

import java.util.Arrays;

public class frequenciesofLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P)
    {
      int[] freq_hash = new int[N+1];

        for(int i=0;i<N;i++){
            if(arr[i]>N){continue;}
            else{
                freq_hash[arr[i]]++;}
        }


      System.out.println(Arrays.toString(freq_hash));
      for(int i=0;i<N;i++)
      {
          arr[i]=freq_hash[i+1];
      }
        System.out.println(Arrays.toString(arr));


    }
    public static void main(String[] args) {
        frequencyCount(new int[]{3,2,2,2,1},5,3);
    }
}
