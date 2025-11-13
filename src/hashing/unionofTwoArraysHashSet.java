package hashing;

import java.util.HashSet;

public class unionofTwoArraysHashSet {
    public static void main(String args[]){
        int a[] = {10,15,20,15,30,30,5};
        int b[] = {30,5,30,80};
        unionofTwoArraysHashSet h = new unionofTwoArraysHashSet();
        int result = h.findunion(a,b);
        System.out.println("Union of both the arrays count is "+result);
    }

    private int findunion(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x: a){
            hs.add(x);
        }
        for(int y: b){
            hs.add(y);
        }
        System.out.println(hs);
        return hs.size();
    }
}
// OUTPUT
// [80, 20, 5, 10, 30, 15]
//Union of both the arrays count is 6