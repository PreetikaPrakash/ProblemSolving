package linkedlist;
// ITERATIVE -- AUXILLARY ARRAY USED
// RECURSIVE -- 2 POINTERS USED -- IN PLACE
// SLIDING POINTER -- 3 POINTERS USED --

class reverseNode{
    int data;
    reverseNode next;

    reverseNode(int data, reverseNode next){
        this.data=data;
        this.next=next;
    }
}
public class reverseLinkedList {

    static reverseNode head= null;
    static reverseNode tail= null;

    static void insert(int data){
        //create a node first
        reverseNode newNode = new reverseNode(data,null);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        head.next = newNode;
        head = newNode;
    }

    static void display(){
        reverseNode disp1 = tail;
        while(disp1!=null){
            System.out.print(disp1.data+" | ");
            disp1 = disp1.next;
        }
        System.out.println();
    }

    static int countNode(){
        int count = 0;
        reverseNode cn = tail;
        while(cn!=null){
            cn = cn.next;
            count++;
        }
        return count;
    }


    static void reverseIteratively(){
        int count  = countNode();
        int[] arr = new int[count];

        // traverse through ll from start
        int a = 0;
        reverseNode i1 = tail;
        while(i1!=null){
            // copy the ll elements to array
            arr[a++] = i1.data;
            i1 = i1.next;
        }
        // traverse through ll from start again
        a--;
        i1=tail;
        while(i1!=null){
            // run the array backwards this time and assign data to ll
            i1.data = arr[a--];
            i1 = i1.next;
        }
    }

    static void reverseRecursively(reverseNode q, reverseNode p){
        if(p==null){
            tail = q; // one previous is q only
        }
        else{
            reverseRecursively(p,p.next);
            p.next = q;
        }
    }

    static void reverseSlidingPointer(){

        reverseNode rr = null;
        reverseNode qq = null;
        reverseNode pp = tail;

        while(pp!=null){
            rr = qq;
            qq = pp;
            pp = pp.next;
            qq.next = rr;
        }
        tail = qq;

    }



    public static void main(String[] args) {
        insert(30);
        insert(50);
        insert(90);
        insert(70);
        display();
        reverseIteratively();
        display();

        insert(130);
        insert(150);
        insert(190);
        insert(170);
        display();
        // q has to be null only at start
        reverseNode j = tail;
        reverseRecursively(null,j);
        display();


        insert(230);
        insert(250);
        insert(290);
        insert(330);
        insert(350);
        insert(390);
        display();
        reverseSlidingPointer();
        display();
    }


}
/*
OUTPUT

30 | 50 | 90 | 70 |
70 | 90 | 50 | 30 |
70 | 90 | 50 | 30 | 130 | 150 | 190 | 170 |
170 | 190 | 150 | 130 | 30 | 50 | 90 | 70 |
170 | 230 | 250 | 290 | 330 | 350 | 390 |
390 | 350 | 330 | 290 | 250 | 230 | 170 |

* */
