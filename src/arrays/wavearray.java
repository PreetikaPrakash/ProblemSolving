package arrays;
//n = 5
//arr[] = {1,2,3,4,5}
//Output: 2 1 4 3 5
//Explanation: Array elements after
//sorting it in wave form are
//2 1 4 3 5.

//n = 6
//arr[] = {2,4,7,8,9,10}
//Output: 4 2 8 7 10 9
//Explanation: Array elements after
//sorting it in wave form are
//4 2 8 7 10 9.


public class wavearray {

    public static void convertToWave(int n, int[] a) {
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; ) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = i + 2;
            }
        } else {
            for (int i = 0; i < n - 2; ) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = i + 2;
            }

        }
    }
}
