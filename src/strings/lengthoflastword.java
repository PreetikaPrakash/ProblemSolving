package strings;

public class lengthoflastword {
        public static int lengthOfLastWord(String s) {
            String[] newChar = s.split(" ");
            int count = 0;
            char[] newc = newChar[newChar.length-1].toCharArray();
            for(int x:newc){
                count++;
            }
            return count;
        }

    public static void main(String[] args) {
        int result = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(result);
    }

    }

/*INPUT
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
* */
