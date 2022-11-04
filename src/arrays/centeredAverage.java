package arrays;

import java.util.Arrays;

public class centeredAverage {
    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int count = 0 ;
        int sum = 0;

        for(int i=1; i<nums.length-1;i++){
            sum = sum + nums[i];
            count++;
        }
        return (int)sum/count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 100};
        int result = centeredAverage(arr);
        System.out.println(result);
    }
}
