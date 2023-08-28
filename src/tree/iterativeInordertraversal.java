package tree;

import java.util.ArrayList;
import java.util.Stack;

public class iterativeInordertraversal {
    class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
        // Function to return a list containing the inorder traversal of the tree.
        ArrayList<Integer> inOrder(Node root) {

            ArrayList<Integer> al = new ArrayList<Integer>();
            if(root==null)
            {return al;}

            Stack<Node> st = new Stack<Node>();



            while(root!=null || !st.isEmpty()){

                if(root!=null){
                    st.push(root);
                    root = root.left;
                }

                else{
                    root = st.pop();
                    al.add(root.data);
                    root = root.right;
                }
            }

            return al;
        }
    }
