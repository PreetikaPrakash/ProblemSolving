package linkedlist;
//corner cases
// 1. when inserting at position 1, head reassigned

class doublyInsertNode {
    int data;
    doublyInsertNode next;
    doublyInsertNode prev;

    public doublyInsertNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class doublyLLinsertionatAnyPosition {

    static void addNode(doublyInsertNode head_ref, int pos, int data)
    {
        doublyInsertNode e = new doublyInsertNode(data);

        doublyInsertNode dd = head_ref;
        for(int i=1;i<pos-1;i++){
            dd=dd.next;
        }
        // adding at last
        if(dd.next == null){
            dd.next = e;
            e.prev = dd;
            e.next = null;
        }

        // adding at first
        if(pos==1){
            e.next = dd;
            dd.prev = e;
            e.prev = null;
            head_ref = e;

        }
        // adding at any position
        else {
            e.next = dd.next;
            dd.next.prev = e;
            e.prev = dd;
            dd.next = e;
        }

        // display linked list
        doublyInsertNode travHead = head_ref;
        while(travHead!=null){
            System.out.print(travHead.data+" | ");
            travHead = travHead.next;
        }
    }
    public static void main(String[] args) {
        doublyInsertNode a = new doublyInsertNode(10);
        doublyInsertNode b = new doublyInsertNode(20);
        doublyInsertNode c = new doublyInsertNode(30);
        doublyInsertNode d = new doublyInsertNode(40);
        doublyInsertNode head = a;

        a.prev = null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = null;

        addNode(head,2,100);// 10,100,20,30,40
        System.out.println();
        addNode(head,1,1000);// 1000,10,100,20,30,40
        System.out.println();
        addNode(head,5,200);// 10,100,20,30,200,40
        System.out.println();
        addNode(head,6,300);// 10,100,20,30,200,300,40
        System.out.println();
        addNode(head,7,400);// 10,100,20,30,200,300,400,40
    }
}
/*
OUTPUT

10 | 100 | 20 | 30 | 40 |
1000 | 10 | 100 | 20 | 30 | 40 |
10 | 100 | 20 | 30 | 200 | 40 |
10 | 100 | 20 | 30 | 200 | 300 | 40 |
10 | 100 | 20 | 30 | 200 | 300 | 400 | 40 |
* */
