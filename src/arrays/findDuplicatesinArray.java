package arrays;

import java.util.ArrayList;

public class findDuplicatesinArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> arrs = new ArrayList<Integer>();
        int[] arrHash = new int[arr.length];

        for(int i = 0;i<n;i++){
            arrHash[arr[i]]++;

        }
        for(int j=0;j<n;j++){
            if(arrHash[j]>1){
                arrs.add(j);
            }
        }
        if(arrs.isEmpty()){
            arrs.add(-1);
        }
        return arrs;
    }
}

/*OUTPUT

Input:
N = 5
a[] = {2,3,1,2,3}
Output:
2 3
Explanation:
2 and 3 occur more than once in the given array.

* */
