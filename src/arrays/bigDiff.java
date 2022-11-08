package arrays;

public class bigDiff {

    public static int bigDiff(int[] nums) {
        int i=0;
        int max_among=nums[0];
        int min_among=nums[0];


        for(i=0;i<nums.length/2;i++)
        {
            max_among=Math.max(max_among,nums[i+1]);
            min_among=Math.min(min_among,nums[i+1]);
        }
        return max_among-min_among;

    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6};
        int r = bigDiff(arr);
        System.out.println(r);

        int arr2[] = {2,10};
        int rr = bigDiff(arr2);
        System.out.println(rr);

        int arr3[] = {7, 6, 8, 5};
        int rrr = bigDiff(arr3);
        System.out.println(rrr);


    }
}
