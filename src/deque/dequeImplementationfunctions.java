package deque;

import java.util.ArrayDeque;

public class dequeImplementationfunctions {
    public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
        dq.addLast(x);
    }

    // Function to pop element from back of the deque.
    public static void pop_back_ppb(ArrayDeque<Integer> dq) {
        dq.pollLast();
    }

    // Function to return element from front of the deque.
    public static int front_dq(ArrayDeque<Integer> dq) {
        if(dq.isEmpty()){
            return -1;
        }
        else{
            return dq.peekFirst();
        }

    }

    // Function to push element x to the front of the deque.
    public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
        dq.addFirst(x);
}}

/*
Input:
5
pf 5
pf 10
pb 6
f
pp_b

Output:
10

Explanation:
1. After push front deque will be {5}
2. After push front deque will be {10, 5}
3. After push back deque will be {10, 5, 6}
4. Return front element which is 10
5. After pop back deque will be {10, 5}
* */
