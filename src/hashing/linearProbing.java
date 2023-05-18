// Part of collision -> Open addressing -> linear probing, quardratic probing, double hashing

// Insert and Search operations are performed below
package hashing;

import java.util.Arrays;

public class linearProbing {
    private static int SIZE=10;

    public static int hashh(int key){
        return key%SIZE;
    }
    public static void Insert(int[] HT, int key){
        int index = hashh(key);
        if(HT[index]!=0){
            while(HT[index+1]%SIZE!=0){
                index++;
            }
            int h = (index+1)%SIZE;
            HT[h] = key;
        }
        else{
            HT[index] = key;
        }
    }
    public static int Search(int[] HT, int key){
        int start_index=hashh(key);
        int i=0;
        while(HT[(start_index+i)%SIZE]!=key){
            i++;
        }
        return (start_index+i)%SIZE;
    }
    public static void main(String[] args) {
        // hashtable represented in array
        int[] HT = new int[10];
        Arrays.fill(HT,0);
        Insert(HT,12);
        Insert(HT,25);
        Insert(HT,35);
        Insert(HT,26);
        System.out.println(Arrays.toString(HT));
        // OUTPUT - [0, 0, 12, 0, 0, 25, 35, 26, 0, 0]
        int ss = Search(HT,35);
        System.out.println("Key 35 found at "+ ss);
        // OUTPUT - Key 35 found at 6

    }
}
