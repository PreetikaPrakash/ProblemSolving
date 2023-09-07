package tree;

import java.util.Stack;

public class sizeofBinaryTree {
    public static int getSize(Node root)
    {
        // Approach
        /*
            1. Level order traversal will be used
            2. we will not push N to stack
            3. while loop will run until stack is empty
        */

        Stack<Node> st = new Stack<>();

        st.push(root);
        int count = 1;

        while(!st.isEmpty())
        {
            Node p = st.pop();
            if(p.right!=null){
                st.push(p.right);
                count++;
            }
            if(p.left!=null){
                st.push(p.left);
                count++;
            }
        }
        return count;

    }
}
/*Approach

Testcase 2: Given Tree is :
                                10
                             /        \
                           5          9
                             \       /     \
                              1    3       6

Output - 6

* */