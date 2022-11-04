package arrays;
/*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come
immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
* */
public class sum13 {

    public static int sum13(int[] nums) {
        int n = nums.length;
        int sum = 0;
        if(n==0){return 0;}
        else{
            for(int i=0;i<n;i++){
                if(nums[i]==13 && i!=n-1){
                    nums[i+1] = 0;
                }
                else if(nums[i]==13 && i==n-1){
                    continue;
                }
                else{
                    sum = sum + nums[i];
                }
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 13};
        int result  = sum13(arr);
        System.out.println(result);

    }
}

// OUTPUT
// 6