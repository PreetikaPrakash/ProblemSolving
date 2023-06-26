package stack;
/* OPERATIONS

* push
* pop
* peek
* stack top
* empty
* full

* */

class StackArrayNode{
    int size;
    int top;
    int[] arr;
}

public class implementStackusingArray {
    static StackArrayNode s = new StackArrayNode();

    static void createStack(){
        s.size = 50;
        s.top  = -1;
        s.arr = new int[s.size];
    }

    static void display(){
        for(int i=s.top;i>=0;i--){
            System.out.println(s.arr[i]);
        }

    }
    static void push(int data){
        // check if data can be inserted or not
        if(s.top==s.size-1){
            System.out.println("Stack overflow");
        }
        else{
            s.top++;
            s.arr[s.top]= data;
        }
    }
    static int pop(){
        // check if element present or not
        int x = -1;
        if(s.top==-1){
            System.out.println("Stack underflow");
        }
        else{
            x=s.arr[s.top];
            s.top--;
        }
        return x;
    }

    static int peek(int position){
        // return the data at specified position
        int x = -1;
        if(s.top-position+1<0){
            System.out.println("Invalid Position");
        }
        else{
            x = s.arr[s.top-position+1];
        }
        return x;
    }
    static int stackTop(){
        int x = -1;
        if(s.top==-1){
            System.out.println("Stack underflow");
        }
        else{
            x = s.arr[s.top];
        }
        return x;
    }

    static boolean isEmpty(){
        if(s.top==-1){return true;}
        else{return false;}
    }

    static boolean isFull(){
        if(s.top==s.size-1){
            return true;
        }
        else{return false;}
    }

    public static void main(String[] args) {
        createStack();
        push(4);
        push(40);
        push(14);
        push(24);
        push(34);
        display();
        System.out.println("poped out element is = "+ pop());
        System.out.println("stack top is = "+ stackTop());
        System.out.println("is stack empty = "+ isEmpty());
        System.out.println("is stack full = "+ isFull());
        display();
        System.out.println("element at 2nd position  = "+ peek(2));
    }
}
/*
OUTPUT
34
24
14
40
4
poped out element is = 34
stack top is = 24
is stack empty = false
is stack full = false
24
14
40
4
element at 2nd position  = 14

*/