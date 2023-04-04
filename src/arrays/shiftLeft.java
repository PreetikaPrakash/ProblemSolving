package arrays;

public class shiftLeft {
    public int[] shiftLeft(int[] nums) {
        int n = nums.length;

        int i;
        if(n==1||n==0){return nums;}
        else{
            int temp = nums[0];//6
            for(i=0;i<n-1;i++){
                nums[i]=nums[i+1];
            }
            nums[i]=temp;
        }
        return nums;
    }



}
