package tree;

import java.util.ArrayList;
import java.util.Stack;

public class levelordertraversalinspiralform {
    int level = 1;
    ArrayList<Integer> findSpiral(Node root)
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

        // imp line
        while((!main_stack.isEmpty())||(!child_stack.isEmpty())){

            // <------ for odd level ----->
            if(level%2==1){
                // main stack is used to pop out
                while(!main_stack.isEmpty()){
                    Node node1 = main_stack.pop();

                    // add popped out element to arraylist
                    final_arr.add(node1.data);

                    // children push direction L to R in child stack
                    // only below two lines are interchanged if compared to zig zag traversal
                    if(node1.right!=null){child_stack.push(node1.right);}
                    if(node1.left!=null){child_stack.push(node1.left);}

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
                    // only below two lines are interchanged if compared to zig zag traversal
                    if(node2.left!=null){main_stack.push(node2.left);}
                    if(node2.right!=null){main_stack.push(node2.right);}

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
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40

Input:
      1
    /   \
   3     2
Output:1 3 2

*/