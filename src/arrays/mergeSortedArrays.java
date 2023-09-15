package arrays;
public class mergeSortedArrays {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};


        int[] nums3 = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(j<n && i<m){

            if(nums1[i]==nums2[j]){
                nums3[k++] = nums1[i];
                i++;
                nums3[k++] = nums2[j];
                j++;
            }
            else if(nums1[i] < nums2[j]){
                nums3[k++] = nums1[i];
                i++;
            }

            else if(nums2[j] < nums1[i]){
                nums3[k++] = nums2[j];
                j++;
            }
        }

        if(i==m)
        {
            while(j<n){
            nums3[k++] = nums2[j++];
            }
        }
        else{
            while(i<m){
                nums3[k++] = nums1[i++];
            }
        }

        for(int p=0; p<m+n; p++){
            nums1[p] = nums3[p];
        }
        for(int x : nums1){
            System.out.println(x);
        }
    }
}

/*Input
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
* */
