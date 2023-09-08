package tree;

import java.util.ArrayList;
import java.util.Stack;

public class gfgIterativePreorder
{
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> temp_arr = new ArrayList<>();
        Stack<Node> temp_stack = new Stack<>();

        temp_stack.push(root);

        while(!temp_stack.isEmpty()){

            Node popped_address = temp_stack.pop();
            temp_arr.add(popped_address.data);
            if(popped_address.right!=null){
                temp_stack.push(popped_address.right);
            }
            if(popped_address.left!=null){
                temp_stack.push(popped_address.left);
            }
        }
        return temp_arr;
    }

}
