package arrays;

public class removeDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1 ){return 1; }
        else{
            int j=1;
            int k=0;
            for(int i = 1; i<nums.length ;i++){
                if(nums[i-1]==nums[i]){
                    k++;
                    continue;
                }
                else{
                    nums[j++] = nums[i];
                }
            }
            return nums.length-k;
        }
    }
}
/*
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
* */
