package tree;
// Below code is for height 4.. in order to increase the height make changes in line 78
/*
THINGS THAT ARE REQUIRED + APPROACH
1) QUEUE - to store the address of nodes (implemented using array) ..it will be of type Tree_Node
    1.1) Enqueue Operation
    1.2) Deque Operation
    1.3) isEmpty Operation
    1.4) display operation
2) Node class - to create a new node to be (implemented using linked list)
3) pointer t/current_node - present at newly created node
4) store the address of root node to queue
5) while queue is not empty repeat below steps
6) pointer p - present at dequeued address of queue
    6.1) Check if p.left!=-1 , ask user to enter left child
            repeat steps 2,3,4
    6.2) Check if p.right!=-1 , ask user to enter right child
            repeat steps 2,3,4
7) while loop ends

* */

import java.util.Scanner;

class Tree_Queue {
    // STEP 1 ----------------------------------------------------------------------------------------------------------
    private Tree_Node[] Queue_arr; // **imp
    private int front;
    private int back;
    private int size;

    Tree_Queue(int size) {
        Queue_arr = new Tree_Node[size];
        front = -1;
        back = -1;
        this.size = size;
    }

    // STEP 1.1 --------------------------------
    public void Tree_enqueue(Tree_Node data) {

        Queue_arr[++front] = data;
    }

    // STEP 1.2 --------------------------------
    public Tree_Node Tree_dequeue() {
        return Queue_arr[++back];
    }

    // STEP 1.3 --------------------------------
    public boolean isEmpty() {
        return front == back;
    }

    // STEP 1.4 --------------------------------
    public void Tree_display() {
        int index = 0;
        while (index < size) {
            System.out.println(Queue_arr[index++]);
        }
    }
}
class Tree_Node{
    // STEP 2 ----------------------------------------------------------------------------------------------------------
       Tree_Node left ;
       Tree_Node right ;
       public int data;

       Tree_Node(int data){
           left = null;
           right = null;
           this.data = data;
       }
}

public class implementBinaryTree {
    public static void main(String[] args) {
        Tree_Queue tq = new Tree_Queue(7);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root node");
        int root_data = sc.nextInt();
        Tree_Node root = new Tree_Node(root_data);

        // STEP 4 ------------------------------------------------------------------------------------------------------
            tq.Tree_enqueue(root);
        // STEP 5 ------------------------------------------------------------------------------------------------------
            while(!tq.isEmpty()){
                // STEP 6 ----------------------------------------------------------------------------------------------
                Tree_Node p = tq.Tree_dequeue();
                    // STEP 6.1 --------------------------------
                        System.out.println("Enter left child of parent node=  "+p.data);
                        sc = new Scanner(System.in);
                        int left_data2 = sc.nextInt();

                            if(left_data2!=-1) {
                                Tree_Node n1 = new Tree_Node(left_data2);
                                tq.Tree_enqueue(n1);
                                p.left = n1;
                            }
                    // STEP 6.2 --------------------------------
                        System.out.println("Enter right child of parent node=  "+p.data);
                        sc = new Scanner(System.in);
                        int right_data2 = sc.nextInt();

                        if(right_data2!=-1) {
                            Tree_Node n2 = new Tree_Node(right_data2);
                            tq.Tree_enqueue(n2);
                            p.right = n2;
                        }
            }
    }
}
