package strings;

import java.util.Locale;

public class panagramChecking {
    public static boolean checkPangram  (String str) {

        String str1 = str.toLowerCase(Locale.ROOT);
        int[] CharHash = new int[125];
        char[] c = str1.toCharArray();
        boolean flag = false;

        //System.out.println(); // ASCII of B is 66, ASCII of 0 is 48, so result is 18
        for (int i = 0; i < c.length; i++) { // O(N)
            int ascii_letter = c[i] - '0' + '0';
            CharHash[ascii_letter]++;
        }

        for(int l=97;l<=122;l++){
            if(CharHash[l]>=1){
                flag = true;
            }
            else{
            flag = false;
            break;
        }
        }

        return flag;
    }
    public static void main(String[] args) {
        System.out.println(checkPangram  ("Bawds jog, flick quartz, vex nymph"));
        System.out.println(checkPangram  ("eiegqcjtsjhqkmvwzedalkjdvmzgrxokchgoalguqcnqyrokqmjs"));

    }

}

/*OUTPUT
* true
* false
* */
