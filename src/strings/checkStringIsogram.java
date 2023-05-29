package strings;

public class checkStringIsogram {
    public static int checkIsogram(String str, int n){
        int[] char_hash = new int[26+1];
        char[] char_array = str.toCharArray();
        boolean flag = false;
        // update the alphabets in hash
        for(int i=0;i<n;i++){
            char_hash[char_array[i]-97]++;
        }
        for(int i=0;i<char_hash.length;i++){
            if(char_hash[i]>1){
                flag = true;
            }
        }

        if(flag==true){return 0;}
        else{return 1;}
    }
    public static void main(String[] args) {
        String str1 = "machine";
        String str2 = "geeks";
        System.out.println(checkIsogram(str1,str1.length()));
        System.out.println(checkIsogram(str2,str2.length()));

    }
}
// OUTPUT
// 1
// 0