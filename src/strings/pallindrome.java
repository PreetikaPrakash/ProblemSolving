/*
OPTIMIZED APPROACH
Time Complexity : O(N)
Space Complexity : O(1)
*/

/*
INPUT
"ABBA" -> EVEN LENGTH
"ACAFACA" -> ODD LENGTH
*/

package strings;
public class pallindrome {

    public static boolean pallind(String str){
        // convert immutable string to mutable character array
        char[] ch1 = str.toCharArray();
        int beg = 0;
        int end = str.length()-1;

        while(beg<end){
            if(ch1[beg]!=ch1[end]){
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "ABBA";
        String str2 = "ACAFACA";
        String str3 = "DDCCFF";
        System.out.println(pallind(str1));
        System.out.println(pallind(str2));
        System.out.println(pallind(str3));
    }
}
