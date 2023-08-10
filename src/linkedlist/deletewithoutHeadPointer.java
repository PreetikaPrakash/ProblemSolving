package linkedlist;

public class deletewithoutHeadPointer {

    class Nodedelete
    {
        int data ;
        Nodedelete next;
        Nodedelete(int d)
        {
            data = d;
            next = null;
        }
    }

    //Function to delete a node without any reference to head pointer.


    class Solution
    {
        void deleteNode(Node del)
        {
            del.data = del.next.data;
            Node p = del.next;
            del.next = p.next;

        }
    }
}

/*
Input:
N = 4
value[] = {10,20,4,30}
node = 20
Output: 10 4 30
Explanation: After deleting 20 from
the linked list, we have remaining
nodes as 10, 4 and 30.
* */
