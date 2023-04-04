package arrays;

import java.util.ArrayList;
import java.util.Collections;

// L[] = {1,2,5,15}
// R[] = {5,8,7,18}
public class maximumOccuredInteger {

    public static int maxOccurInt(int L[], int R[],int n, int maxx) {
        // i have taken 1000 as finding out max in R would have costed O(R)/O(n) time
        ArrayList<Integer> al = new ArrayList<Integer>(Collections.nCopies(maxx+1, 0));
        for (int i = 0; i < n; i++) {
            int q = L[i];
            int h = R[i];
            for (int j = q; j <= h; j++) {
                int value = al.get(j);
                int setvalue = value + 1;
                al.set(j, setvalue);
            }
        }
        int max = 0;
        for(int k=1;k<maxx;k++){
            if(al.get(k)>max){
                max = al.get(k);
            }
        }
        return al.indexOf(max);
    }
    public static void main(String[] args) {
        int L[]= new int[]{1,2,5,15};
        int R[]= new int[]{5,8,7,18};

        int result = maxOccurInt(L,R,4,18);
        System.out.println(result);



    }
}


