package arrays;

public class has77 {
    public static boolean has777(int[] nums) {
        boolean flag = false;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]==7 && nums[i+1]==7){return true;}
            else if((nums[i] == 7) && (nums[i + 1] != 7)){
                if(((i+2)<=nums.length-1) && (nums[i + 2] == 7))
                {return true;}
                else{continue;}
            }
            else{continue;}
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr1[]={7, 2, 7, 2, 2, 7};//true
        int arr2[]={2, 7, 2, 2, 7, 7};//true
        int arr3[]={7, 7, 1, 1, 7};//true
        int arr4[]={1, 7, 7}; //true
        int arr5[]={2, 7, 2, 2, 7, 2}; // false
        int arr6[]={2, 7, 2, 2, 7, 7};// true

        System.out.println(has777(arr1));
        System.out.println(has777(arr2));
        System.out.println(has777(arr3));
        System.out.println(has777(arr4));
        System.out.println(has777(arr5));
        System.out.println(has777(arr6));
    }
}