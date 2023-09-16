package arrays;

public class removeElement {
        public static int removeElement(int[] nums, int val) {
            int p = 0;
            int j = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    p++;
                    continue;
                }
                else{
                    nums[j++]= nums[i];
                }
            }
            return nums.length-p;
        }

    public static void main(String[] args) {
            int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int k = removeElement(nums, 2);
        for(int i = 0;i<k;i++){
            System.out.print(nums[i]+ " ");
        }
    }
    }
/*INput
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
* */
