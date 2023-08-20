package strings;

public class repeatingCharacter {

    // OLD CODE - ATTEMPT 1
    /*
    public static int strstr(String s){
        int[] hash_str = new int[26];
        char[] ch1 = s.toCharArray();
        String strrr = "";

        for(int i=0;i<ch1.length;i++){
            hash_str[ch1[i]-97]++;
        }
        System.out.println(Arrays.toString(hash_str));
        for(int i=0;i<ch1.length;i++){
            if(hash_str[ch1[i]-97] > 1){
                strrr = strrr + ch1[i];
            }
        }
        char[] ch2 = strrr.toCharArray();
        int num=0;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]==ch2[0]){
                num = i;
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str1= "geeksforgeeks";
        System.out.println(strstr(str1));

    }

    */

    // NEW CODE - ATTEMPT 2

    static int repeatedCharacter(String S)
    {
        /* APPROACH 1
            1- Create Hash Table
            2- Traverse S and store the count in hash table
            3- Traverse S again and check which character value is >1
        */


        int[] CharHash = new int[125];
        char[] chr = S.toCharArray();

        for(int i=0;i<chr.length;i++){
            CharHash[chr[i]-'0'+'0']++;
        }

        for(int j=0;j<chr.length;j++){
            if(CharHash[chr[j]-'0'+'0']>1){
                return j;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String str1= "geeksforgeeks";
        int indexObtained = repeatedCharacter(str1);
        System.out.println(str1.charAt(indexObtained));
    }

}
