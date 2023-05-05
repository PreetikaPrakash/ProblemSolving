// pre-requisite
/**
 * we just have to check arr2 is a subset of arr1 or not
 * Expected Time Complexity : O(n)
 * Expected Space Complexity : O(n)
 */
package arrays;
import java.util.Arrays;
public class arraySubsetofAnotherArray {
    public String isSubset(long[] a1, long[] a2, long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int j = 0;
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(a2[j]==a1[i]){
                flag=true;
            }
            else{
                flag  = false;
                continue;
            }
            if(j==m-1){
                return "Yes";
            }
            else{
                j++;
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        arraySubsetofAnotherArray as = new arraySubsetofAnotherArray();
        String h = as.isSubset(new long[]{8,4,5,3,1,7,9}, new long[]{5,1,3,7,9}, 7,5 );
        System.out.println(h);
    }
}
