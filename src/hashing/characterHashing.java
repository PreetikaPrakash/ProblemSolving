package hashing;

import java.util.Arrays;

public class characterHashing {
    public static void charHash(String str,int n){
        char c[]= str.toCharArray();
        int[] hassh = new int[26];
        for(int i=0;i<n;i++){
            hassh[c[i]-97]++;
        }
        System.out.println(Arrays.toString(hassh));
        // OUTPUT - [2, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // sort the character array
        String new_str="";
        for (int i =0; i<hassh.length;i++){
            while(hassh[i]>0){
                char ik = (char) (i+97);
                new_str = new_str + ik;
                hassh[i]--;
            }
        }
        System.out.println(new_str);
        // OUTPUT - aabbcd
    }

    public static void main(String[] args){
        String str ="abacbd";
        charHash(str,str.length());
    }
}
