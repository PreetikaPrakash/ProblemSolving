package linkedlist;

public class merge {
    public static Node head;
    /*public static Node mergeTwoSortedList(Node head1, Node head2){
        Node n = new Node();
        Node it1 =head1;
        Node it2 =head2;
        while(it1!=null && it2!=null){
            if(it1.data < it2.data){

            }
            else{

            }
        }




    }*/
    public static void insetAtEnd(int new_data){
        Node iterator = head;
        while(iterator.next!=null){
            iterator = iterator.next;
        }
        Node temp = new Node(new_data);
        iterator.next = temp;
    }
    public static void reverse(){
        Node iterator = head;
        Node prev = null;
        while(iterator!=null){
            Node temp = iterator.next;
            iterator.next = prev;
            prev = iterator;
            iterator = temp;
        }
        head = prev;
    }
    public static void printLinkedList(Node head){
        Node iterator = head;
        while(iterator!=null){
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.println("\n");
    }
    public static boolean checkLoop(Node head){

        // USE HASHSET - hashing
            Node itr = head;
            boolean flag = false;
            while(itr.next!=head ){
                itr= itr.next;
                flag = true;
            }
            return flag;
        /*Node temp = new Node(1);
        while (head != null) {
            if (head.next == null) {
                return false;
            }
            if (head.next == temp) {
                return true;
            }

            Node next = head.next;
            head.next = temp;
            head = next;
        }

         */
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        head = a;
        boolean bb =checkLoop(head);
        System.out.println(bb);
        //printLinkedList(head);



    }
}
