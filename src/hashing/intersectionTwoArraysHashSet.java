package hashing;

import java.util.HashSet;

public class intersectionTwoArraysHashSet {
    public static void main(String args[]){
        int a[] = {10,15,20,15,30,30,5};
        int b[] = {30,5,30,80};
        intersectionTwoArraysHashSet h = new intersectionTwoArraysHashSet();
        int result = h.findintersection(a,b);
        System.out.println("Both the arrays are intersecting at "+result+" places");
    }
    private int findintersection(int a[], int b[]){
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int x:a){
            hs.add(x);
        }
        for(int y:b){
            if(hs.contains(y)){
                res++;
                hs.remove(y);
            }
        }
        return res;
    }
}
// OUTPUT : Both the arrays are intersecting at 2 places
