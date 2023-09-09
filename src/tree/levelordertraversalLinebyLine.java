package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int item)
    {
        data = item;
        left = right = null;
    }
}

public class levelordertraversalLinebyLine {


    static ArrayList<ArrayList<Integer>> levelOrder(TreeNode node)
    {
        // we dont have to print out $, compiler will do it for us

        /*

        ArrayList<ArrayList<Integer>> means
        it is a 2 D list
        each row is a separate list

        **for example**

         ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // Create some inner ArrayLists and add them to the outer ArrayList

        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        innerList1.add(3);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);

        list2D.add(innerList1);
        list2D.add(innerList2);


        */

        ArrayList<ArrayList<Integer>> outertemp_arr = new ArrayList<>();

        // base conditions----------------
        if (node==null){
            return outertemp_arr;
        }

        Queue<TreeNode> temp_q = new LinkedList<>();

        // 1st row arraylist---------------------
            ArrayList<Integer> temp_list1 = new ArrayList<>();
            temp_list1.add(node.data);
            temp_q.add(node);
            temp_q.add(null);
            outertemp_arr.add(temp_list1);

            ArrayList<Integer> innertemp_list = new ArrayList<>();

            while(temp_q.size()>1){

                TreeNode root = temp_q.poll();

                if(root==null){
                    temp_q.add(null);
                    outertemp_arr.add(innertemp_list);
                    innertemp_list = new ArrayList<Integer>();
                    continue;
                }

                if(root.left!=null){
                    innertemp_list.add(root.left.data);
                    temp_q.add(root.left);
                }
                if(root.right!=null){
                    innertemp_list.add(root.right.data);
                    temp_q.add(root.right);
                }

            }

        return outertemp_arr;

    }

    public static void printTree(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printTree(node.left);
            printTree(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        // Connect the nodes to form the tree structure
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.right = node8;

        // Print the tree using a depth-first traversal (preorder)
        //printTree(node1);

        ArrayList<ArrayList<Integer>> arr = levelOrder(node1);

        for(ArrayList<Integer> x: arr){
            System.out.println(x);
        }


    }
}

/*
          1
       /     \
     2        3
   /    \     /   \
  4     5   6    7
    \
     8

expected o/p in gfg ->      1 $ 2 3 $ 4 5 6 7 $ 8 $.
my o/p ->
[1]
[2, 3]
[4, 5, 6, 7]
[8]
Note: The driver code prints the levels '$' separated.
* */