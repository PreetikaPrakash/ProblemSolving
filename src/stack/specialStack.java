package stack;

import java.util.Stack;

public class specialStack {

    public void push(int a, Stack<Integer> s)
    {
        // if(s.isEmpty()){
        // s.push(a);}

        s.push(a);

    }
    public int pop(Stack<Integer> s)
    {
        //     int result =-1;
        //     if(!s.isEmpty()){
        // result = s.pop();}
        // return result;

        return s.pop();
    }
    public int min(Stack<Integer> s)
    {
        int minValue = s.pop();

        while(!s.isEmpty()){

            int y = s.pop();

            if(y<minValue){

                minValue=y;
            }
        }
        return minValue;
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        if(s.size()==n){
            return true;
        }
        else{
            return false;}
    }
    public boolean isEmpty(Stack<Integer>s)
    {
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
// INPUT
//Stack: 18 19 29 15 16
// OUTPUT - 15
