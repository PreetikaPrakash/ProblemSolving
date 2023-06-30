package linkedlist;

class DupNode{
    int data;
    DupNode next;
    public DupNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class removeDuplicatedfromSortedLL {
    static void removeDuplicatesLL(DupNode start){

        // display the LL
        DupNode f = start;
        while(f!=null){
            System.out.print(f.data + " | ");
            f=f.next;
        }

        // remove duplicates
        DupNode q = start;
        DupNode p = q.next;

        while(p!=null){
            if(q.data==p.data){
                q.next = p.next;
                p = p.next;
            }
            else{
                p = p.next;
                q = q.next;
            }
        }

        System.out.println("\nLinked List after removing elements");
        f=start;
        while(f!=null){
            System.out.print(f.data + " | ");
            f=f.next;
        }



    }
    public static void main(String[] args) {
        DupNode a = new DupNode(2);
        DupNode b = new DupNode(2);
        DupNode c = new DupNode(3);
        DupNode d = new DupNode(3);
        DupNode e = new DupNode(4);

        DupNode head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        removeDuplicatesLL(head);

    }
}

/*OUTPUT

2 | 2 | 3 | 3 | 4 |
Linked List after removing elements
2 | 3 | 4 |

* */


