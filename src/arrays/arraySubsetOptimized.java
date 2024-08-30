package arrays;

public class arraySubsetOptimized {
    public String isSubset( long a1[], long a2[], long n, long m) {

        // two for loops cant be used because of time complexity mentioned.
        // using hash table
        // Step 1 : create a hash table
        // Step 2 : 1st for loop, iterate through a1 array and assign values in hash table
        // Step 3 : 2nd for loop, iterate through a2 array and compare its value with hash table.


        int HT[] = new int[1000000];
        boolean flag = true;

        for(int i=0;i<n;i++){
            int value = (int)a1[i];
            HT[value-1]++;
        }

        for(int i=0;i<m;i++){
            int value2 = (int)a2[i];
            if(HT[value2-1]>=1)
            {
                HT[value2-1]--;
            }
            else
            {
                flag = false;
                break;
            }

        }
        if(flag==true)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}

/* OUTPUT

Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}

Output:
Yes
Explanation:
a2[] is a subset of a1[]
 */

/*
Expected Time Complexity: O(max(n,m))
Expected Auxiliary Space: O(n)
*/
