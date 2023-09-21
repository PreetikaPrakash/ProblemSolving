package strings;

import java.util.Arrays;

public class reverseWordsinString {

    static String reverseWords(String S)
    {
        // If you want to split String on the dot you need to escape dot as \\.
        // only using String[] newChar = S.split("."); --> doesnt work we need to use below line of code
        String[] newChar = S.split("\\.");

        String newChar2 = "";

        int n = newChar.length;

        for(int i=n-1;i>=0;i--){
            newChar2 = newChar2 + newChar[i];
            if(i>0){
                newChar2 = newChar2+".";
            }
        }
        return newChar2;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}

/*OUTPUT

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i

* */

// SUBMITTED TO LEETCODE - 151. Reverse Words in String


/*
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
* */

/*
public String reverseWords(String s) {
        String[] newstring = s.split(" ");
        s = "";
        for(int i=newstring.length-1;i>=0;i--){
            if(newstring[i]!=""){
                  s = s + newstring[i] + " ";
            }
        }
        return s.trim();
    }
* */
