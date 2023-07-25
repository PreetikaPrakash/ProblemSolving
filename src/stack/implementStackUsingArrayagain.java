package stack;

// Stack structure as array
class StackAgain{
    int top;
    int size;
    int[] arr;
}

public class implementStackUsingArrayagain {

    // StackAgain class object
    StackAgain sa = new StackAgain();

    // initialize stack
    void createStack(int size){

        sa.top = -1;
        sa.size = size;
        sa.arr = new int[sa.size];
    }

    boolean isEmpty(){
        if(sa.top==-1){
            return true;
        }
        return false;
    }

    void push(int data){
        // check if stack is full then dont push
        if(sa.top==sa.size-1){
            System.out.println("Stack overflow");
        }
        else{
            sa.top++;
            sa.arr[sa.top] = data;
        }
    }

    int pop(){
        // check if stack is empty dont pop
        int y=0;
        if(isEmpty()){System.out.println("Stack is empty nothing to pop");}
        else{
            y = sa.arr[sa.top];
            sa.top--;
        }
        return y;
    }

    void display(){
        while(!isEmpty()){
            int x = pop();
            System.out.println(x);
        }
    }


    public static void main(String[] args) {
        implementStackUsingArrayagain obj = new implementStackUsingArrayagain();
        obj.createStack(6);
        obj.push(5);
        obj.push(10);
        obj.pop();
        obj.push(15);
        obj.push(20);
        obj.display();


    }


}

// output
// 20
// 15
// 5