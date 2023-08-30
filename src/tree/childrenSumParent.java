package tree;

import java.util.Scanner;

public class childrenSumParent {


    public static int isSumProperty(Node root)
    {
        int x,y,sum=0;

        if(root==null){return 1;}
        if(root.left==null && root.right==null){return 1;}



        if(root.left!=null){sum = sum + root.left.data;}

        if(root.right!=null){sum = sum + root.right.data;}

        if(root.data==sum){
            return  (isSumProperty(root.left) & isSumProperty(root.right)); // bitwise
        }
        return 0;
    }


}
