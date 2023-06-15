package linkedlist;
// ITERATIVE
// RECURSIVE
// OPTIMIZED - MOVE TO HEAD

class searchNode{
    int data;
    searchNode next;
    searchNode(int data, searchNode next){
        this.data = data;
        this.next = next;
    }
}
public class searchingLinkedList {

    // INSERT IN LINKED LIST
    static searchNode head = null;
    static searchNode tail = null;
    public static void insertLL(int data){
        searchNode p = new searchNode(data,null);
        //for inserting first element
        if(head==null){
            head = p;
            tail = p;
        }
        else{
            head.next = p;
            head = p;
        }
    }

    // DISPLAY IN LINKED LIST
    public static void displayLL() {
        searchNode trav = tail;
        while (trav!=null) {
            System.out.print(trav.data + " | ");
            trav = trav.next;
        }
    }

    // ITERATIVE SEARCH KEY IN LINKED LIST
    public static searchNode searchLL(int key){
        searchNode sea = tail;
        while(sea!=null){
            if(sea.data == key){
                return sea;
            }
            sea=sea.next;
        }
        return null;
    }

    // RECURSIVE SEARCH KEY IN LINKED LIST
    public static searchNode searchRR(searchNode sea, int key){
        if(sea==null){
            return null;
        }
        if(sea.data == key){
            return sea;
        }
        else{return searchRR(sea.next,key);}
    }

    // OPTIMIZED SEARCH KEY IN LINKED LIST
        // move to head approach
    public static void searchOPT(int key){
        searchNode heads = tail;
        searchNode sea = tail;
        searchNode prev = sea;

        while(sea!=null){
            if(sea.data == key){
                prev.next = sea.next;
                sea.next = heads;
                heads=sea;
            }
            prev = sea;
            sea=sea.next;
        }
        searchNode trav3 = heads;
        while (trav3!=null) {
            System.out.print(trav3.data+ " | ");
            trav3 = trav3.next;
        }
    }


    public static void main(String[] args) {
        insertLL(5);
        insertLL(30);
        insertLL(15);
        insertLL(7);
        insertLL(1);
        displayLL();
        System.out.println();

        // iterative

        System.out.println("---Iterative search---");
        searchNode temp = searchLL(15);
        if(temp!=null){System.out.println("Element is found");
        }
            else{System.out.println("Element not found");}
        System.out.println();

        // recursive
        System.out.println("---Recursive search---");
        searchNode first = tail;
        searchNode temp2 = searchRR(first,10);
        if(temp2!=null){System.out.println("Element is found");
        }
        else{System.out.println("Element not found");}
        System.out.println();

        // optimized
        System.out.println("---Optimized search---");
        searchOPT(1);
    }
}
