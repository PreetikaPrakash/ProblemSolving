package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class rightviewofBinaryTree {

    ArrayList<Integer> rightView(Node root) {

        ArrayList<Integer> main_arr = new ArrayList<>();
        ArrayList<Integer> child_arr = new ArrayList<>();

        if(root==null){
            return main_arr;
        }

        Queue<Node> main_queue = new LinkedList<>();

        main_queue.add(root);
        main_queue.add(null);
        main_arr.add(root.data);

        while(main_queue.size()>1){

            root = main_queue.poll();

            if(root==null){
                main_queue.add(null);
                // only below line is changed from left view
                main_arr.add(child_arr.get(child_arr.size()-1));
                child_arr = new ArrayList<>();
                continue;
            }

            if(root.left!=null){
                main_queue.add(root.left);
                child_arr.add(root.left.data);
            }
            if(root.right!=null){
                main_queue.add(root.right);
                child_arr.add(root.right.data);
            }

        }
        return main_arr;
    }
}
/*

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

O/p -> 1 3 7 8

Input:
     10
    /   \
  20     30
 /   \
40  60
Output: 10 30 60

* */