package hashing;

import java.util.HashSet;

public class countDistinctElements {
    public static void main(String args[]){
        int arr[] = {10,20,10,20,30};
        countDistinctElements cde = new countDistinctElements();
        int result = cde.countDistinct(arr);
        System.out.println("Count of distinct elements are "+ result);
    }

    private int countDistinct(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
}
//Output : Count of distinct elements are 3