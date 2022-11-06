package arrays;

public class haveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean flag = true;
        for(int i = 0 ;i <nums.length;i++){
            if(nums[i]==3){
                count++;
            }
        }

        if(count==3){
            for(int i = 0 ;i <nums.length-1;i++){
                if(nums[i]==3){
                    if(nums[i+1]==3){
                        return false;
                    }
                    else{continue;}
                }

            }
        }
        else{return false;}




        return true;
    }

}
