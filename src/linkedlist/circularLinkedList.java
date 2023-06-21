package linkedlist;
/*
* DISPLAY CIRCULAR LINKED LIST
* INSERT AT GIVEN INDEX IN CIRCULAR LINKED LIST AND MODIFY HEAD IF NEEDED and RETURN HEAD
* DELETE HEAD NODE AND ANY NODE
*/

class circularNode{
    int data;
    circularNode next;

    circularNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class circularLinkedList {

    static circularNode head = null;

    // DISPLAY CIRCULAR LINKED LIST
        static void display(circularNode h){
            circularNode p = h;
            do{
                System.out.print(p.data+ " | ");
                p=p.next;
            }while(p!=h);
        }
    // INSERT AT GIVEN INDEX IN CIRCULAR LINKED LIST AND MODIFY HEAD IF NEEDED and RETURN HEAD
        static circularNode circularInsert(int index, circularNode newNode, circularNode current_head){

            circularNode p = current_head;

            if(index==0){
                while (p.next!=current_head){
                    p=p.next;
                }
                p.next = newNode;
                newNode.next = current_head;
                current_head = newNode;
                head = current_head;
            }
            else{
                for(int i=1;i<index-1;i++){
                    p=p.next;
                }
                newNode.next = p.next;
                p.next = newNode;
            }
            return head;
        }

    // DELETE HEAD NODE AND ANY NODE
        static circularNode circularDelete(int index,circularNode current_head) {
                circularNode p = current_head;
                circularNode q = p;

                if(index==0){
                    while(p.next!=current_head){
                        p=p.next;
                    }
                    p.next = current_head.next;
                    current_head = current_head.next;
                }
                else{
                        for(int i=1;i<index;i++){
                            q=p;
                            p = p.next;
                        }
                    q.next  =p.next;
                }
            return current_head;
            }

        public static void main(String[] args) {

        circularNode c1 = new circularNode(10);
        circularNode c2 = new circularNode(20);
        circularNode c3 = new circularNode(30);
        circularNode c4 = new circularNode(40);

        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c1;

        // DISPLAY
            System.out.println("Displaying linked list");
            circularNode head = c1;
            display(head);

        // INSERT
            System.out.println("\nInsert node 5 at index 0");
            circularNode head1 = circularInsert(0,new circularNode(5),head);
            display(head1);

            System.out.println("\nInsert node 35 at index 4");
            circularNode head2 = circularInsert(4,new circularNode(35),head);
            display(head2);

        // DELETE
            System.out.println("\nDelete node at index 0");
            circularNode head3 = circularDelete(0,head2);
            display(head3);

            System.out.println("\nDelete node at index 3");
            circularNode head4 = circularDelete(3,head3);
            display(head4);

    }
}

/* OUTPUT

Displaying linked list
10 | 20 | 30 | 40 |
Insert node 5 at index 0
5 | 10 | 20 | 30 | 40 |
Insert node 35 at index 4
5 | 10 | 20 | 30 | 35 | 40 |
Delete node at index 0
10 | 20 | 30 | 35 | 40 |
Delete node at index 3
10 | 20 | 35 | 40 |
* */
