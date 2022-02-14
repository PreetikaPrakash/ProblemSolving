package arrays_strings;

public class squares_of_stored_array {
    public int[] sortedSquares(int[] nums) {
        int nums2[]= new int[nums.length];
        for(int i=0; i<nums.length;i++)
        {
            nums2[i] = nums[i] * nums[i];
        }

        // Applying Bubble Sort
        int counter=0;
        while(counter<nums2.length-1) {
            for (int k = 0; k < nums2.length - 1; k++) {
                if (nums2[k] > nums2[k + 1]) {
                    int temp = nums2[k];
                    nums2[k] = nums2[k + 1];
                    nums2[k + 1] = temp;
                }
                else {
                    continue;
                }
            }
            counter++;
        }
        return nums2;
    }

    // PSVM -> Not Required while submitting code
    public static void main(String[] args){
        squares_of_stored_array sq = new squares_of_stored_array();
        int nums[] = {-4,-1,0,3,10};

        int arr[] = sq.sortedSquares(nums);


        // Printing to Console
        for(int j=0; j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }}

