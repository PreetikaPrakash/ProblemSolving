package arrays;

import java.util.Arrays;

public class arraySubsetofAnotherArray {

    public static boolean binarySearch(long[] a1, long value, long low, long high) {
        while (low <= high) {
            int mid = (int) ((low + high) / 2);
            if (value == a1[mid]) {
                return true;
            }
            if (value > a1[mid]) {
                low = mid + 1;
            }
            if (value < a1[mid]) {
                high = mid - 1;
            }
        }
        return false;
    }
    public String isSubset(long[] a1, long[] a2, long n, long m) {
        boolean ans = true;
        int j=0;
        Arrays.sort(a1);
        while(ans && j<m){
            ans = arraySubsetofAnotherArray.binarySearch(a1,a2[j],0,n);
            j++;
        }
        String anss = "";
        anss = anss + ans;
        return anss;

    }

    public static void main(String[] args) {
        arraySubsetofAnotherArray as = new arraySubsetofAnotherArray();
        String h = as.isSubset(new long[]{11, 1, 13, 21, 3, 7}, new long[]{11, 3, 7, 1}, 6,4 );
        System.out.println(h);//
        
        
    }
}

//OUTPUT - TLE
