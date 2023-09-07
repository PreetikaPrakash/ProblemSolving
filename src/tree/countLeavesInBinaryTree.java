package tree;

import java.util.Stack;

public class countLeavesInBinaryTree {
    int countLeaves(Node node)
    {
        // level order traversal used to reach all the nodes
        // stack is used to store the address of last visited node
        // if both left and right child of popped element is not present the do count++

        Stack<Node> st = new Stack<>();
        int count = 0;

        st.push(node);

        while(!st.isEmpty()){
            Node popped = st.pop();

            if(popped.right!=null){
                st.push(popped.right);
            }
            if(popped.left!=null){
                st.push(popped.left);
            }
            if(popped.left==null && popped.right==null){
                count++;
            }

        }
        return count;

    }

}

/*
Input:
Given Tree is
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3
Output:
3
Explanation:
Three leaves are 3 , 5 and 1.
* */
