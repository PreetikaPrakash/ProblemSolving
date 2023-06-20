package linkedlist;
// Using Floyd Cycle Finding Algoithm
// A linked is in LOOP when the last element points to any of the previous element in the LL

class loopNode {
    int data;
    loopNode next;

    loopNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class loopLinkedList {

    static boolean checkLoop(loopNode head){

        loopNode p = head;
        loopNode q = head;
        int flag =0;

        // while(p!=null && q!=null && p!=q){
        /* in this while loop the cursor didnt went inside becuase p and q were already equal */

        while(p!=null && q!=null && q.next!=null){
            p = p.next;
            q = q.next.next;
            if(p==q){
                flag=1;
                break;
            }
        }
        if(p==q){return true;}
        else{return false;}
    }

    public static void main(String[] args) {

        loopNode i1 = new loopNode(1);
        loopNode i2 = new loopNode(3);
        loopNode i3 = new loopNode(4);

        loopNode h = i1;
        i1.next = i2;
        i2.next = i3;
        i3.next = i2;

        if(checkLoop(h)){
            System.out.println("Your linked list is in LOOP");
        }
        else{
            System.out.println("No LOOP found in your linked list");
        }

        loopNode j1 = new loopNode(5);
        loopNode j2 = new loopNode(6);
        loopNode j3 = new loopNode(7);

        loopNode tail = j1;
        j1.next = j2;
        j2.next = j3;
        j3.next = null;

        if(checkLoop(tail)){
            System.out.println("Your linked list is in LOOP");
        }
        else{
            System.out.println("No LOOP found in your linked list");
        }

    }
    /*
    * OUTPUT
    Your linked list is in LOOP
    No LOOP found in your linked list
    * */




}
