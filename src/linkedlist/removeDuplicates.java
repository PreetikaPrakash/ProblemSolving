package linkedlist;

class removeNode{
    int data;
    removeNode next;

    removeNode(int data, removeNode next){
        this.data=data;
        this.next=next;
    }
}
public class removeDuplicates {
    static removeNode head= null;
    static removeNode tail= null;

    static void insert(int data){
        //create a node first
        removeNode newNode = new removeNode(data,null);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        head.next = newNode;
        head = newNode;
    }

    static void display(){
        removeNode disp1 = tail;
        while(disp1!=null){
            System.out.print(disp1.data+" | ");
            disp1 = disp1.next;
        }
        System.out.println();
    }
    static void removeDup(){
        removeNode p = tail;
        removeNode q = p.next;
        while(q!=null){
            if(p.data!=q.data){
                p=p.next;
                q=q.next;
            }
            else{
                p.next = q.next;
                // free q from memory
                q = p.next;
            }
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(30);
        insert(40);
        insert(40);
        insert(40);
        display();
        removeDup();
        display();
    }
}

/* OUTPUT

10 | 20 | 30 | 30 | 40 | 40 | 40 |
10 | 20 | 30 | 40 |


* */
