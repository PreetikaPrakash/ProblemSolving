package arrays;

public class removeDuplicatesfromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1 ){return 1; }
        else{
            int j=1;
            int k=0;
            int count = 1;

            for(int i = 1; i<nums.length ;i++){
                if(nums[i-1]==nums[i]){
                    count ++;
                    if(count <= 2 ){
                        nums[j++] = nums[i];
                    }
                    else{
                        k++;
                        continue;
                    }
                }
                else{
                    count = 0;
                    nums[j++] = nums[i];
                }
            }
            return nums.length-k;
        }
    }

    public static void main(String[] args) {
        int[] numss = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(numss);
        System.out.println(result);
        for(int x : numss){
            System.out.println(x);
        }
    }
}
/*
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */