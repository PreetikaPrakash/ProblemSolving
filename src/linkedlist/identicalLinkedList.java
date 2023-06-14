package linkedlist;

class identicalNode {
    int data;
    Node next;

    public identicalNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class identicalLinkedList {
    public boolean isIdentical (Node head1, Node head2){
        Node h1 = head1;
        Node h2 = head2;
        int h11=0;
        int h22=0;

        while(h1!=null){
            h11++;
            h1 = h1.next;

        }
        while(h2!=null){
            h22++;
            h2 = h2.next;

        }

        if(h22!=h11){return false;}

        while(head1!=null){
            if(head1.data!=head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}
