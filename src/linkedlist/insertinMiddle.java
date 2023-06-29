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



}
