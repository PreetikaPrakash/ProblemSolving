// return lexicographically smaller value;
package strings;
import java.util.Arrays;
public class maximumOccuringCharacter {
    public static char getMaxOccuringChar(String line)
    {
        int[] hash_Occur = new int[26];
        char[] ch = line.toCharArray();
        for(int i=0;i<ch.length;i++){
            hash_Occur[ch[i]-97]++;
        }
        int max = 0;
        for(int i=0;i<hash_Occur.length;i++){
            if(hash_Occur[i]>max){
                max = hash_Occur[i];
            }
        }
        int ourIndex=0;
        for(int i=0;i<hash_Occur.length;i++){
            if(hash_Occur[i]==max){
                ourIndex = i;
                break;
            }
        }
        char c = ((char)(97+ourIndex));
        return c;

    }
    public static void main(String[] args) {
        String str1= "testsample";
        String str2= "output";
        System.out.println(getMaxOccuringChar(str1));
        System.out.println(getMaxOccuringChar(str2));

    }
}

// OUTPUT
//e
//t
