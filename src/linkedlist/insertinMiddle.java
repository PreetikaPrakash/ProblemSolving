package linkedlist;

class insertMidNode {
    int data;
    insertMidNode next;

    public insertMidNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class insertinMiddle {

        public insertMidNode insertInMid(insertMidNode head, int data){
            insertMidNode gq = new insertMidNode(data);
            insertMidNode nm = head;
            int count = 0;
            while(nm!=null){
                count++;
                nm = nm.next;
            }
            int half = count/2;
            if(count%2==0){
                half = half -1;
            }

            nm=head;
            while(half>0){
                nm=nm.next;
                half--;
            }
            gq.next = nm.next;
            nm.next=gq;
            return head;
        }


/*
Input:
LinkedList = 1->2->4
key = 3
Output: 1 2 3 4
Explanation: The new element is inserted
after the current middle element in the
linked list.

Input:
LinkedList = 10->20->40->50
key = 30
Output: 10 20 30 40 50
Explanation: The new element is inserted
after the current middle element in the
linked list and Hence, the output is
10 20 30 40 50.
* */
}
