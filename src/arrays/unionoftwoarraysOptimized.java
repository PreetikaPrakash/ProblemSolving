package arrays;

public class unionoftwoarraysOptimized {
    public static int doUnion(int arr1[], int arr2[]) {
        // 1. create hashtable
        // 2. 1st for loop, iterate through arr1 and mark the elements in hashtable
        // 3. 2nd for loop, iterate through arr2 and mark the elements in hashtable
        // 4. 3rd for loop, count the index numbers from hashtable which are greater than 0

        int HT[] = new int[100000];
        int count = 0;
        for(int i=0;i<arr1.length;i++)
        {
            HT[arr1[i]]++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            HT[arr2[i]]++;
        }
        for(int i=0;i<100000;i++)
        {
            if(HT[i]>0){
                count++;
            }
        }
        return count;
    }
}
/*
    Time complexity : O(n1+n2)

        Space complexity : O(1)
*/

