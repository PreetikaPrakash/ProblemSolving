package tree;

import java.util.Stack;

public class sumofBinaryTree {
    static int sumBT(Node head){
        Stack<Node> st = new Stack<>();

        int sum = 0;
        st.push(head);
        sum = sum + head.data;

        while(!st.isEmpty()){
            Node p = st.pop();

            if(p.right!=null){
                sum = sum + p.right.data;
                st.push(p.right);
            }

            if(p.left!=null){
                sum = sum + p.left.data;
                st.push(p.left);
            }

        }
        return sum;
    }

}

/*
Example:
Input:
2
2
1 2 L 1 -1 N
6
1 2 L 1 3 R 2 -1 N 2 -1 N 3 3 L 3 -1 N
Output:
3
9
* */

/*
time complexity

The time complexity of the provided code is O(N), where N is the number of nodes in the binary tree.

Here's why the time complexity is O(N):

The code uses a while loop that iterates as long as the stack is not empty. In the worst case, every node in the binary tree will be pushed onto the stack and then popped off the stack exactly once. Therefore, the while loop runs in O(N) time because it visits each node once.
Inside the while loop, there are constant-time operations like pushing and popping elements from the stack, adding integers to the sum variable, and checking for null left and right children. These constant-time operations do not change the overall time complexity, so the dominant factor is the while loop itself.
As a result, the time complexity of this code is linear, O(N), where N is the number of nodes in the binary tree. It performs a single pass through all the nodes in the tree, making it efficient for calculating the sum of all node values in the binary tree.
* */
