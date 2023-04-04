package arrays;

import java.util.ArrayList;
import java.util.List;

public class reverseArraysInGroups {
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
            int j=k;
            List arr2;
            ArrayList<Integer> al = new ArrayList<>(n);

            int count = 0;
            for(int i=0;i<n;){
                if(j<n) {
                    arr2 = arr.subList(i, j);
                    al.addAll(arr2);
                    i = i + k;
                    j = j + k;
                }
                else{
                    arr2 = arr.subList(i,n);
                    al.addAll(arr2);
                }
            }



        }


    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int N = 5;
        int K = 3;
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        reverseInGroups(ar,N,K);
    }
}
