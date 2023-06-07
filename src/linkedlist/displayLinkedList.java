// CONVERT ARRAY TO LINKED LIST

package linkedlist;
class displayNode{

    int data;
    // next should be of type pointer
    // int next; -> error becuase type is int
    // next should be of type node becuase it has to point another node.
    displayNode next; // in java next is a reference variable of type node

    // below is the structure for creating a new node, whenever node is called and data is passed to it.
    displayNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class displayLinkedList {

    static displayNode create(int[] arr) {

        // Step 1 : create first node with data A[0]
        displayNode first = new displayNode(arr[0]);
            // first is the head pointer
            // first pointer is having reference of this new node with 1 as the data and next as null

        // Step 2 : create another pointer of type node which points to the head of the linked list but this pointer can be used for traversal.
        displayNode last = first;
            // means last holds the same reference which first holds.

        // Step 3: now convert other array elements to linked list
        for(int i=1;i<arr.length;i++){
            // Step 4 : firstly, each element will be allocated in each node, so node has to be created.
            displayNode sub = new displayNode(arr[i]);
            // Step 5 : now, last -> next should point to this newly created node
            last.next = sub;// FYI , sub.next is already null
            last = sub;
        }

        return first;
    }
    static void display(int[] arr){

        displayNode trav = create(arr);
        while(trav!=null){
            System.out.println(trav.data);
            trav = trav.next;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        create(arr);
        display(arr);
    }

}
// OUTPUT
//1
//2
//3
//4