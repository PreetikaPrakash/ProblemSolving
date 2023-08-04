/*APPROACH
            // if s2 is empty
                // if s1 if empty
                    // queue is empty
                // else transfer from s1 to s2
            // else pop out from s2
* */
package queue;
import java.util.Stack;

public class queueUsingTwoStacks {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x) {
        s1.add(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop() {
        int result = -1;

        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return result;
            } else {
                while (!s1.isEmpty()) {
                    s2.add(s1.pop());
                }
            }
        }
        return s2.pop();
    }
}
/*
Input:
5
1 2 1 3 2 1 4 2

Output:
2 3

Explanation:
In the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the queue
    will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.
* */
