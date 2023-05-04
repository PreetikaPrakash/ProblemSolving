package arrays;

public class correctMissingnuminArray {
    static int MissingNumber(int array[], int n) {

        int sum = 0;
        int two_sum = 0;
        for (int i = 1; i <= n; i++) {
            two_sum = two_sum + i;
        }
        for (int i = 0; i < n - 1; i++) {
            sum = sum + array[i];
        }
        return two_sum - sum;
    }

    public static void main(String[] args) {
        int res=MissingNumber(new int[]{6,1,2,8,3,4,7,10,5},10);
        System.out.println(res);
    }
}