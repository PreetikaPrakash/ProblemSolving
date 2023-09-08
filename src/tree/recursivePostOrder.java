package tree;

import java.util.ArrayList;

public class recursivePostOrder {

    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> temp_arr = new ArrayList<>();

        if(root!=null){

            temp_arr.addAll(postOrder(root.left)); // imp---addAll
            temp_arr.addAll(postOrder(root.right)); // imp---addAll
            temp_arr.add(root.data);
        }
        return temp_arr;
    }
}
