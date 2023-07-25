package stack;

// Stack represented in linked list --- collection of stack nodes will form stack as linkedlist
class StackNode{
    int data;
    StackNode next;

    StackNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class implementStackUsingLLAgain {

    // initialize stack
    StackNode top = null;

    void push(int data){
        StackNode newNode = new StackNode(data);
        // if stack is full --> dont insert
        if(newNode ==null){
            System.out.println("Stack overflow");
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    int pop(){
        // if stack is empty --> dont pop
        int result =-1;
        if(top==null){
            System.out.println("Nothing to remove");
        }
        else{
            result= top.data;
            top = top.next;
        }
        return result;
    }

    void display(){
        StackNode t = top;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    int peek(int position){
        StackNode q = top;
        int p=1;
        while(p!=position && q!=null){
            p++;
            q=q.next;
        }
        int ans = q.data;
        return ans;
    }

    public static void main(String[] args) {
        implementStackUsingLLAgain obj = new implementStackUsingLLAgain();
        obj.push(4);
        obj.push(13);
        obj.push(43);
        obj.pop();
        obj.push(63);
        obj.push(53);
        obj.display();
        int res = obj.peek(3);
        System.out.println("Element at 3rd position is "+ res);


    }
}
//OUTPUT

/*

53
63
13
4
Element at 3rd position is13

* */