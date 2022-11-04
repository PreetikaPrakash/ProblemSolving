package arrays;

public class rotateLeft1spot {

    public static int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        return nums;
    }

    public static void main(String[] args) {
        int nums[]= {1, 2, 3};
        int arr2[]=new int[nums.length];
        arr2=rotateLeft3(nums);
        for(int i = 0 ; i<nums.length;i++){
            System.out.printf("%d ",arr2[i]);
        }
    }


}

//OUTPUT
// 2 3 1