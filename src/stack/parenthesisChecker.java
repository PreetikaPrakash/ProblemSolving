// Implemented Stack using array
package stack;
class PStack{
    int size;
    int top;
    char[] a;
}
public class parenthesisChecker {
    static PStack stack = new PStack();
    static int newCount = 0;

    static void createStack(String x){
        stack.size = x.length();
        stack.top = -1;
        stack.a = new char[stack.size];
    }

    static void push(char data){
        if(stack.top!=stack.size-1){
            stack.top++;
            stack.a[stack.top] = data;
            newCount++;
        }
        // if stack is full
        else{
            System.out.println("StackOverflow");
        }
    }
    static char pop(){
        char poped = ' ';
        // if stack empty
        if(stack.top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            poped = stack.a[stack.top];
            stack.top--;
        }
        return poped;
    }

    static boolean ispar(String x)
    {
        char[] arr= x.toCharArray();
        for(int i=0;i<arr.length;i++){
            // push open bracket
                if(arr[i]=='('||arr[i]=='['||arr[i]=='{'){
                    push(arr[i]);
                    System.out.println("Pushed element is " + arr[i]);
                }
                else if(arr[i]==')'|| arr[i]==']'||arr[i]=='}'){
                    System.out.println("Poped element is " + pop());
                }
            // pop open bracket when close bracket in arr
            // ignore other elements other than brackets
            // check - if at last open bracket is remaining - parenthesis not matching
            // check - if in stack while poping no open bracket present to pop - parenthesis not matching
        }
        stack.size = newCount;

        // display stack
        if(stack.top==-1){
            System.out.println("Stack is empty");
            System.out.println("Pair of brackets present");
            return true;
        }
        else{
            System.out.println("Value present at stack top is " + stack.top);
            return false;
        }

    }

    public static void main(String[] args) {
        String str1 = "{([])}"; // true
        createStack(str1);
        System.out.println(ispar(str1));

        System.out.println("*************");
        String str2 = "()"; // true
        System.out.println(ispar(str2));

        System.out.println("*************");
        String str3 = "([]"; // false
        System.out.println(ispar(str3));

    }
}

/*OUTPUT
Pushed element is {
Pushed element is (
Pushed element is [
Poped element is [
Poped element is (
Poped element is {
Stack is empty
Pair of brackets present
true
*************
Pushed element is (
Poped element is (
Stack is empty
Pair of brackets present
true
*************
Pushed element is (
Pushed element is [
Poped element is [
Value present at stack top is 0
false





* */