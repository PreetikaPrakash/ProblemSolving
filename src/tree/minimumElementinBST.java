package tree;

public class minimumElementinBST {

    class Node{
        int data;
        Node leftchild;
        Node rightchild;

        Node(int data){
            this.data = data;
            leftchild=null;
            rightchild=null;
        }
    }

    int minValue(Node node) {

        // till node.left is not equal to null
        // store max in variable
        // compare nodes left to max in one while loop

        if(node==null) return -1;
        int minn = node.data;
        while(node.leftchild!=null){
            if(node.leftchild.data<minn){
                minn=node.leftchild.data;
            }
            node = node.leftchild;
        }

        return minn;
    }

    Node createTree1(){
        minimumElementinBST obj = new minimumElementinBST();

        minimumElementinBST.Node rootnode = obj.new Node(5);
        minimumElementinBST.Node l1_leftchild = obj.new Node(4);
        minimumElementinBST.Node l1_rightchild = obj.new Node(6);
        rootnode.leftchild = l1_leftchild;
        rootnode.rightchild = l1_rightchild;

        minimumElementinBST.Node l2_1 = obj.new Node(3);
        l1_leftchild.leftchild = l2_1;

        minimumElementinBST.Node l2_2 = obj.new Node(7);
        l1_rightchild.rightchild = l2_2;

        minimumElementinBST.Node l3_1 = obj.new Node(1);
        l2_1.leftchild = l3_1;

        return rootnode;
    }

    Node createTree2(){
        minimumElementinBST obj = new minimumElementinBST();

        minimumElementinBST.Node rootnode = obj.new Node(9);
        minimumElementinBST.Node l1_rightchild = obj.new Node(10);
        rootnode.rightchild = l1_rightchild;

        minimumElementinBST.Node l2_1 = obj.new Node(11);
        l1_rightchild.rightchild = l2_1;

        return rootnode;
    }

    public static void main(String[] args) {

        minimumElementinBST obj = new minimumElementinBST();
        Node rootnode = obj.createTree1();
        int result = obj.minValue(rootnode);
        System.out.println(result);

        Node rootnode2 = obj.createTree2();
        int result2 = obj.minValue(rootnode2);
        System.out.println(result2);

    }
}
