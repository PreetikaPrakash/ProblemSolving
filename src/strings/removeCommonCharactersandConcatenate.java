package strings;

import java.util.Arrays;

public class removeCommonCharactersandConcatenate {

    public static String concatenatedString(String s1,String s2)
    {
        int[] char_hashtable = new int[26+1];

        // store string 1 to hashtable
        char[] c1 = s1.toCharArray();
        for(int i=0;i<s1.length();i++){
            char_hashtable[c1[i]-97]++;
        }

        // store string 2 to hashtable
        char[] c2 = s2.toCharArray();
        for(int i=0;i<s2.length();i++){
            if(char_hashtable[c2[i]-97]>0){//a
                char_hashtable[c2[i]-97]=0;
            }
            else{
                char_hashtable[c2[i]-97]++;
            }
        }
        String ans="";

        for(int i=0;i<c1.length;i++){
            if(char_hashtable[c1[i]-97]>0){
                ans = ans + c1[i];
            }
        }
        for(int i=0;i<c2.length;i++){
            if(char_hashtable[c2[i]-97]>0){
                ans = ans + c2[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s1 = "aaccdb"; // 2,1,2,1
        String s2 = "gafd";
        System.out.println(concatenatedString(s1,s2));
        //ccbgf
    }
}
