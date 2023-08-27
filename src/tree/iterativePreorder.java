package tree;

import java.util.ArrayList;
import java.util.Stack;

class Node{
     int data;
     Node left,right;
     Node(int d){
         data=d;
         left=right=null;
     }
 }
public class iterativePreorder {

    static ArrayList<Integer> preorder(Node root)
    {

        ArrayList<Integer> al = new ArrayList<Integer>();
        if(root==null){
            return al;
        }

        Stack<Node> st = new Stack<Node>();
        st.push(root);

        while(!st.isEmpty()){
            root = st.pop();
            al.add(root.data);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return al;

    }

}
