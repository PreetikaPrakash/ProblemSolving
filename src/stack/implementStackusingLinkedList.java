package stack;
/* OPERATIONS

 * push
 * pop
 * peek

 * */

class StackLLNode{
    int data;
    StackLLNode next;

    StackLLNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class implementStackusingLinkedList {

    // create stack class object to access its members
    static StackLLNode top = null;
    static int count = 0;

    static void push(int x){
        // if stack full then dont push
        StackLLNode newNode = new StackLLNode(x);
        if(newNode==null){
            System.out.println("Stack is full");
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    static int pop(){
        // if stack is empty dont pop element
        int result =-1;
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            StackLLNode temp = top;
            result = temp.data;
            top = top.next;
        }
        count--;
        return result;
    }

    static int peek(int position){
        int reCount = count;
        StackLLNode ref = top;
        while(reCount-1>0){
            reCount--;
            ref=ref.next;
        }
        return ref.data;
    }


    static void display(StackLLNode head){
        while(head!=null){
            System.out.println(head.data + " | ");
            head=head.next;
            count++;
        }
    }

    public static void main(String[] args) {
            push(40);
            push(50);
            push(60);
            push(70);
            System.out.println("**** This is original Stack ****");
            display(top);
            System.out.println("**** poped up element is **** \n" + pop());
            System.out.println("**** Element at first position is ****\n" + peek(1));
    }
}

/*OUTPUT

**** This is original Stack ****
70 |
60 |
50 |
40 |
**** poped up element is ****
70
**** Element at first position is ****
40

*/