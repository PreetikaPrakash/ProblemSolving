package queue;

import java.util.ArrayList;

public class generateBinaryNumber {
    //Function to generate binary numbers from 1 to N using a queue.

    static ArrayList<String> generate(int N)
    {
        ArrayList<String> al = new ArrayList<>();
        int index = 1;

        while(index<=N){
            String result = Integer.toBinaryString(index);
            al.add(result);
            index++;
        }
        return al;
    }
}
/*
Input:
N = 5
Output:
1 10 11 100 101
Explanation:
Binary numbers from
1 to 5 are 1 , 10 , 11 , 100 and 101.
* */