package tree;

public class recursiveTwoTreesSame {

    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }


    static boolean isIdentical(Node root1, Node root2)
    {
        if((root1==null)&&(root2==null)){
            return true;
        }
        else if((root1==null)||(root2==null)){
            return false;
        }
        else{
            return (root1.data==root2.data)&&isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right);

        }
    }

    public static void main(String[] args) {

    }
}

/*OUTPUT
Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: No
Explanation: There are two trees both
having 3 nodes and 2 edges, but both
trees are not identical.
* */
