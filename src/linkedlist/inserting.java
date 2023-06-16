package linkedlist;
// INSERT BEFORE INDEX 1
// INSERT BEFORE INDEX 3
// INSERT AT INDEX 2
// INSERT AFTER INDEX 4
// INSERT AT LAST
// DELETE INDEX 4
// CHECK LL SORTED OR NOT

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
    static void insertLast(int element){
        insertNode il_head = tail;
        insertNode il_newNode = new insertNode(element,null);
        while(il_head.next!=null){
            il_head = il_head.next;
        }
        il_head.next=il_newNode;
    }

    static void deleteIndex(int position){
        insertNode del_head = tail;
        insertNode del_tail = del_head;
        for(int i=1;i<position;i++){
            del_tail = del_head;
            del_head = del_head.next;
        }
        del_tail.next = del_head.next;
    }

    static boolean checkSorted(){
        insertNode check = tail;
        insertNode check_head = tail;
        insertNode check_tail = check_head;

        while(check.next!=null){
            check_tail=check_head;
            check_head = check_head.next;
            if(check_tail.data>check_head.data){
                return false;
            }
        }
        return true;
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

        System.out.println("\nINSERT AT LAST");
        insertLast(100);
        display();

        System.out.println("\nDELETE INDEX 4");
        deleteIndex(4);
        display();

        System.out.println("\nCHECK LL SORTED OR NOT");
        if(checkSorted()){
            System.out.println("Sorted");}
        else{
            System.out.println("Not Sorted");}

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

INSERT AT LAST
70 | 90 | 11 | 30 | 55 | 33 | 22 | 60 | 100 |

DELETE INDEX 4
70 | 90 | 11 | 55 | 33 | 22 | 60 | 100 |

CHECK LL SORTED OR NOT
Not Sorted
* */
