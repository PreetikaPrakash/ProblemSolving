package tree;

import java.util.Stack;

public class countNonLeafNodes {
    int countNonLeafNodes(Node node) {

        Stack<Node> st = new Stack<>();
        int count = 0;
        int inc = 0;

        st.push(node);

        while(!st.isEmpty()){
            Node popped = st.pop();

            if(popped.right!=null){
                st.push(popped.right);
                inc++;
            }
            if(popped.left!=null){
                st.push(popped.left);
                inc++;
            }
            if(popped.left==null && popped.right==null){
                count++;
            }

        }
        return inc-count+1; // 1 is for root node
    }
}
/*
Input:
Image
Output:
2
Explanation:
Nodes 1 and 2 are the only non leaf nodes.
* */
