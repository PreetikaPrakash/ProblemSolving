package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class maximumwidthofTree {
    int getMaxWidth(Node root) {
        ArrayList<Integer> main_arr = new ArrayList<>();
        ArrayList<Integer> child_arr = new ArrayList<>();

        if(root==null){
            return 0;
        }

        Queue<Node> main_queue = new LinkedList<>();

        main_queue.add(root);
        main_queue.add(null);
        main_arr.add(1);

        while(main_queue.size()>1){

            root = main_queue.poll();

            if(root==null){
                main_queue.add(null);
                // only below line is changed from left view and right view
                main_arr.add(child_arr.size());
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
        Integer result = Collections.max(main_arr);
        int i = result.intValue();
        return i;
    }
}

/*

Input:
        10
      /     \
    20      30
   /    \
  40    60
Output: 2
There is one node on level 1(10)
There is two node on level 2(20, 30)
There is two node on level 3(40, 60)
Hence the answer is 2


* */
