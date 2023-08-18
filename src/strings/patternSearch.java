package strings;

public class patternSearch {

    static boolean search(String pat, String txt)
    {
        /* APPROACH 1


            1. Run a loop from start to end of P, Create a variable for String S index starting from 0 till S.length - P.length position.
            2. if each letter of P maches substring of S then set flag as true, if loop ends and still the value is true then return true
            3. if each letter of P doesnt matches substring of S then set flag as false, Now check from +1 position of string S.

        */
        /* APPROACH 2


            1. Run a loop from start to end of S, Create a variable for String P index starting from 0 till P.length position.
            2. if each letter of S maches substring of P then set flag as true, if P variable reaches its final value  and still the value is true then return true
            3. if each letter of S doesnt matches substring of P then set flag as false, Now check from +1 position of string S.

        */

        char[] S = txt.toCharArray();
        char[] P = pat.toCharArray();


        int P_index = 0;
        int P_endIndex = P.length; // 4
        boolean flag = false;

        for(int i=0;i<S.length;i++){
            if(S[i]==P[P_index++]){
                flag = true;
                if(P_index==P_endIndex){
                    break;
                }
            }
            else{
                P_index = 0;
                flag = false;
                i--;
            }
        }

        if(flag == true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search("baaa", "baabaaa"));
    }
}
