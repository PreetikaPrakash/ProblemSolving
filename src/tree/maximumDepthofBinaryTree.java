package tree;

public class maximumDepthofBinaryTree {

    public static int maxDepth(Node root) {
        // Approach 1 - Level order Traversal
        // Approach 2 - Find height of tree using recursion

        // Implementing approach 2
        if(root==null){
            return 0;
        }
        else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}


/*
Input:
 root  -->     1
             /   \
            3     2
           /
          4
Output: 3
Explanation:
Maximum depth is between nodes 1 and 4, which is 3.

* */