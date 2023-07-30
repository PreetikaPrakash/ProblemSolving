package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKElements {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> ss = new Stack<>();
        int h = k;
        while(h>0){
            ss.push(q.remove());
            h--;
        }
        h=k;
        Queue<Integer> qq = new LinkedList<>();
        while(h>0){
            qq.add(ss.pop());
            h--;
        }

        while(q.size()>0){
            qq.add(q.remove());
        }
        return qq;
    }
}
/*
Input:
5 3
1 2 3 4 5

Output:
3 2 1 4 5

Explanation:
After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.
* */
