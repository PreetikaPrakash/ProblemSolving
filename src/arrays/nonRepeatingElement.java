// TIME COMPLEXITY - O(N^2) - with loops
// SPACE COMPLEXITY - O(N)
// OPTIMIZED TIME COMPLEXITY - O(N) - with Dictionary
package arrays;

public class nonRepeatingElement {
    public static int firstNonRepeating(int arr[], int n) {
        int j =1;
        int i=0;
        if(n==1){return arr[i];}
        while(j<n) {
            if (arr[i] != arr[j]) {
                j++;
                if (j == n) {
                    return arr[i];
                }
            }
            else {
                i++;
                j=i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int y =firstNonRepeating(new int[]{-1, 2, -1, 3, 2},5); //3
        int k =firstNonRepeating(new int[]{1,1,1},3); // 0
        int l =firstNonRepeating(new int[]{-1,-17,-12,8,16,-17,-13,-14,-3,-6,-5,-11,-10,-12,-5,19,-17,-5,-1,12},20); //8
        System.out.println(y);
        System.out.println(k);
        System.out.println(l);

    }
}
