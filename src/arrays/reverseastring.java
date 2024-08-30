package arrays;

public class reverseastring {
    public static String reverseWord(String str)
    {
        String new_str="";
        char str_arr[] = str.toCharArray();
        for(int i=str_arr.length-1;i>=0;i--){
            new_str = new_str + str_arr[i];
        }

        return new_str;
    }
}
/*
Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).
*
My Time Complexity: O(n^2).
My Auxiliary Space: O(n).
*
*
* */