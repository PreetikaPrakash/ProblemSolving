package linkedlist;
// INSERT BEFORE INDEX 1
// INSERT BEFORE INDEX 3
// INSERT AT INDEX 2
// INSERT AFTER INDEX 4

class insertNode{
    int data;
    insertNode next;

    insertNode(int data, insertNode next){
        this.data=data;
        this.next=next;
    }
}

public class inserting {
    static insertNode head= null;
    static insertNode tail= null;

    static void insert(int data){
        //create a node first
        insertNode newNode = new insertNode(data,null);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        head.next = newNode;
        head = newNode;
    }

    static void display(){
        insertNode disp1 = tail;
        while(disp1!=null){
            System.out.print(disp1.data+" | ");
            disp1 = disp1.next;
        }
        System.out.println();
    }

    static void insertBefore(int position, int element){
        insertNode ib_head = tail;
        insertNode ib_newNode = new insertNode(element,null);

        if(position==1){
            ib_newNode.next = ib_head;
            ib_head = ib_newNode;
            tail = ib_head;
        }
        else{
            for(int i=1;i<position-1;i++){
                ib_head = ib_head.next;
            }
            ib_newNode.next=ib_head.next;
            ib_head.next=ib_newNode;
        }
    }
    static void insertAfter(int position, int element){
        insertNode ia_head = tail;
        insertNode ia_newNode = new insertNode(element,null);
        for(int i=1;i<position;i++){
            ia_head = ia_head.next;
        }
        ia_newNode.next = ia_head.next;
        ia_head.next=ia_newNode;
    }

    public static void main(String[] args) {
        insert(90);
        insert(30);
        insert(22);
        insert(60);
        display();

        System.out.println("\nINSERT BEFORE INDEX 3");
        insertBefore(3,55);
        display();
        System.out.println("\nINSERT BEFORE INDEX 1");
        insertBefore(1,70);
        display();

        System.out.println("\nINSERT AFTER INDEX 4");
        insertAfter(4,33);
        display();

        System.out.println("\nINSERT AT INDEX 3");
        insertBefore(3,11);
        display();

    }
}
/* OUTPUT

90 | 30 | 22 | 60 |

INSERT BEFORE INDEX 3
90 | 30 | 55 | 22 | 60 |

INSERT BEFORE INDEX 1
70 | 90 | 30 | 55 | 22 | 60 |

INSERT AFTER INDEX 4
70 | 90 | 30 | 55 | 33 | 22 | 60 |

INSERT AT INDEX 3
70 | 90 | 11 | 30 | 55 | 33 | 22 | 60 |

* */
