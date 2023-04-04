package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
// 1 2 3 4 2 2 4 3 2 1
// reaching middle node
// reverse second half
// compare first half with second

/*public class checkPallindrome {
    public static Node head;
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
    public static Node findMiddle(){
        Node slow = head;
        //Node fast = head; // for odd
        Node fast = head.next; // for even
        //while(fast!=null){ for odd
        while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        }
        return slow;
    }

   // }
    public static void main(String[] args) {
        Node a = new Node(1);
        head = a;
        insetAtEnd(2);
        insetAtEnd(3);
        insetAtEnd(4);
        insetAtEnd(2);
        insetAtEnd(2);
        insetAtEnd(4);
        insetAtEnd(3);
        insetAtEnd(2);
        insetAtEnd(1);
        printLinkedList(head);
        reverse();
        printLinkedList(head);
        Node middle = findMiddle();
        System.out.println(middle.data);
        printLinkedList(head);
    }


}
*/