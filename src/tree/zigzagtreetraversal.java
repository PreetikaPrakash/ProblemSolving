package tree;

import java.util.ArrayList;
import java.util.Stack;

public class zigzagtreetraversal {
    int level = 1;

    ArrayList<Integer> zigZagTraversal(Node root)
    {

        ArrayList<Integer> final_arr = new ArrayList<>();

        // <------ edge case ----->
        if(root==null){
            return final_arr;
        }

        Stack<Node> main_stack = new Stack<>();
        Stack<Node> child_stack = new Stack<>();

        // <------ for root node ----->

        main_stack.push(root);

        while((!main_stack.isEmpty())||(!child_stack.isEmpty())){

            // <------ for odd level ----->
            if(level%2==1){
                // main stack is used to pop out
                while(!main_stack.isEmpty()){
                    Node node1 = main_stack.pop();

                    // add popped out element to arraylist
                    final_arr.add(node1.data);

                    // children push direction L to R in child stack
                    if(node1.left!=null){child_stack.push(node1.left);}
                    if(node1.right!=null){child_stack.push(node1.right);}
                }
                level++;
            }

            // <------ for even level ----->
            if(level%2==0){
                // child stack is used to pop out
                while(!child_stack.isEmpty()){
                    Node node2 = child_stack.pop();

                    // add popped out element to arraylist
                    final_arr.add(node2.data);

                    // children push direction R to L in main stack
                    if(node2.right!=null){main_stack.push(node2.right);}
                    if(node2.left!=null){main_stack.push(node2.left);}
                }
                level++;
            }
        }
        return final_arr;
    }
}

/*
INPUT

Input:
        1
      /   \
     2     3
    / \   /  \
   4   5 6    7
Output:
1 3 2 4 5 6 7

Input:
           7
        /     \
       9       7
     /  \     /
    8    8   6
   /  \
  10   9
Output:
7 7 9 8 8 6 9 10

* */