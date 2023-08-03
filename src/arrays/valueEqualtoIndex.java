package arrays;

import java.util.ArrayList;

public class valueEqualtoIndex {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] == i+1){
                al.add(arr[i]);
            }
        }
        return al;
    }
}
/*
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
* */
