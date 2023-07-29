package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class queueReversal {
    public static Queue<Integer> rev(Queue<Integer> q){
        // Make Queue -> Stack
        Stack<Integer> sq = new Stack<>();

        while(q.size()>0){
            System.out.println(q.peek());
            sq.push(q.remove());
        }

        while(sq.size()>0){
            System.out.print(sq.pop()+"| "); // 6| 2| 10| 1| 3| 4|
        }

        while(sq.size()>0){
            q.add(sq.pop());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(3);
        queue.add(1);
        queue.add(10);
        queue.add(2);
        queue.add(6);
        Queue<Integer> s = rev(queue);
        while(s.size()>0){
            System.out.print(s.remove()+"||");
        }


    }


}
//  6 2 10 1 3 4.
