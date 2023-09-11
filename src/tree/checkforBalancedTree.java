package tree;

public class checkforBalancedTree {
    class Tree
    {

        int isleftBalanced(Node root)
        {
            if(root==null){return 0;}
            else{
                return Math.max(isleftBalanced(root.left),isleftBalanced(root.right))+1;
            }
        }
        int isrightBalanced(Node root)
        {
            if(root==null){return 0;}
            else{

                return Math.max(isrightBalanced(root.left),isrightBalanced(root.right))+1;
            }
        }


        boolean isBalanced(Node root)
        {
            // TOP - DOWN APPROACH

            if(root==null){
                return true;
            }
            else{
                int leftCount = isleftBalanced(root.left);
                int rightCount = isrightBalanced(root.right);

                return (Math.abs(leftCount-rightCount)<=1 && isBalanced(root.left) && isBalanced(root.right));
            }
        }
    }

}
