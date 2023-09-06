package tree;
/*
----------------Approach-------------------------------------------------------
1. Implement Node of the tree will be created using linked list.
2. Node of the tree will contain left child node and right child node and data.
3. Take input from user to enter left node and right node.
4. display the complete tree.
* */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class levelOrderTraversal {

    class levelOrder_Node{

        int data;
        levelOrder_Node leftNode;
        levelOrder_Node rightNode;

        levelOrder_Node(int data){
            this.data = data;
            leftNode = null;
            rightNode = null;
        }
    }
    class levelOrder_AddressQueue{
        private levelOrder_Node[] levelOrder_Queue;
        private int front;
        private int back;
        private int size;

        levelOrder_AddressQueue(int size){
            levelOrder_Queue = new levelOrder_Node[size];
            this.front = -1;
            this.back = -1;
            this.size = size;
        }

        public void levelOrder_enqueue(levelOrder_Node data){
            levelOrder_Queue[++front] = data;
        }

        public levelOrder_Node levelOrder_dequeue(){
            return levelOrder_Queue[++back];
        }

        public boolean levelOrder_isEmpty(){
            return front == back;
        }
    }

    private int heightoftree(){
        System.out.println("---------Enter the height of binary tree-------");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println("---------"+height+" is the height of the tree---------");
        return height;
    }
    private levelOrder_Node createRootNode(){
        System.out.println("---------Enter the root node of the tree-------");
        Scanner sc = new Scanner(System.in);
        int rootnode = sc.nextInt();
        levelOrder_Node root_object = new levelOrder_Node(rootnode);
        System.out.println("---------"+rootnode+" is the root node of the tree---------");
        return root_object;
    }

    static void levelordertrav(levelOrder_Node node){
        ArrayList<String> al = new ArrayList<>();
        Queue qq = new ArrayDeque<levelOrder_Node>();

        qq.add(node);
        al.add(String.valueOf(node.data));
        al.add("$");

        while(!qq.isEmpty()){
            levelOrder_Node obt = (levelOrder_Node) qq.remove();
            if (obt.leftNode.data!=-1){
                al.add(String.valueOf(obt.leftNode.data));
                qq.add(obt.leftNode);
            }
            if (obt.rightNode.data!=-1){
                al.add(String.valueOf(obt.rightNode.data));
                qq.add(obt.rightNode);
            }
            al.add("$");
        }
        for (String z : al){
            System.out.println(z);
        }

        }

    public static void main(String[] args) {

        levelOrderTraversal main_object = new levelOrderTraversal();
        int height = main_object.heightoftree();
        levelOrderTraversal.levelOrder_AddressQueue addressQ = main_object.new levelOrder_AddressQueue(height*2);

        levelOrder_Node rootnode = main_object.createRootNode();
        addressQ.levelOrder_enqueue(rootnode);

        while(!addressQ.levelOrder_isEmpty()){

            levelOrder_Node node_obtained = addressQ.levelOrder_dequeue();

            System.out.println("---------Enter the left child of "+node_obtained.data);
            Scanner sc = new Scanner(System.in);
            int leftchild = sc.nextInt();

            if(leftchild!=-1){
                levelOrderTraversal.levelOrder_Node leftchild_object = main_object.new levelOrder_Node(leftchild);
                addressQ.levelOrder_enqueue(leftchild_object);
                node_obtained.leftNode = leftchild_object;
            }


            System.out.println("---------Enter the right child of "+node_obtained.data);
            sc = new Scanner(System.in);
            int rightchild = sc.nextInt();

            if(rightchild!=-1){
                levelOrderTraversal.levelOrder_Node rightchild_object = main_object.new levelOrder_Node(rightchild);
                addressQ.levelOrder_enqueue(rightchild_object);
                node_obtained.rightNode = rightchild_object;
            }
        }

        levelordertrav(rootnode);


    }
}
