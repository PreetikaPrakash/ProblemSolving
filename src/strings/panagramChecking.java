package strings;

public class panagramChecking {
    public static boolean checkPangram  (String str) {
        int[] CharHash = new int[125];
        char[] c = str.toCharArray();
        boolean flag = true;

        //System.out.println(); // ASCII of B is 66, ASCII of 0 is 48, so result is 18
        for (int i = 0; i < c.length; i++) { // O(N)
            int ascii_letter = c[i] - '0' + '0';
            CharHash[ascii_letter]++;
        }

        for (int j = 65; j < CharHash.length; j++) {
            if ((j >= 65 || j <= 90) && (j >= 97 || j <= 122)) {
                if (CharHash[j] > 1) {
                    flag = true;
                } else {
                    flag = false;
                }
            } else {
                continue;
            }
        }

        if (flag == true) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPangram  ("Bawds jog, flick quartz, vex nymph"));
    }

}
