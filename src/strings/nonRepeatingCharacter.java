// only lowercase expected
//"a" = 97
//"z" = 122
package strings;

import java.util.Arrays;

public class nonRepeatingCharacter {
    static char nonrepeatingCharacter(String S)
    {

        // hash table with 26 indexes
        // hash table with 26 indexes
        int[] str_hash = new int[26];

        char[] char_hash = S.toCharArray();
        char ch = '\0';

        for(int i=0;i<char_hash.length;i++){
            str_hash[char_hash[i]-97]++;
        }
        for (int i=0;i<char_hash.length;i++){
            if((str_hash[char_hash[i]-97])==1){
                ch = char_hash[i];
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "zxvczbtxyzvy";
        System.out.println(nonrepeatingCharacter(string2));
    }
}
