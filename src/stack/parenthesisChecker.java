// Implementing using array
package stack;

import java.util.Locale;

class Stack{
    int size;
    int top;
    char[] a;
}
public class parenthesisChecker {

    static Stack stack = new Stack();

    static void createStack(String x){
        stack.size = x.length();
        stack.top = -1;
        stack.a = new char[stack.size];
    }

    static void push(char data){
        int i=0;
        if(stack.top!=stack.size-1){
            stack.a[i++] = data;
            stack.top++;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    static boolean ispar(String x)
    {
        char[] arr= x.toCharArray();
        for(int i=0;i<arr.length;i++){
            // push open bracket
                if(arr[i]=='('||arr[i]=='['||arr[i]=='{'){
                    push(arr[i]);
                }
            // pop open bracket when close bracket in arr
            // ignore other elements other than brackets
            // check - if at last open bracket is remaining - parenthesis not matching
            // check - if in stack while poping no open bracket present to pop - parenthesis not matching
        }
        for(int i=0;i<stack.size;i++){
            System.out.println(stack.a[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "{([])}"; // true
        createStack(str1);
        System.out.println(ispar(str1));
//        String str2 = "()"; // true
//        System.out.println(ispar(str2));
//        String str3 = "([]"; // false
//        System.out.println(ispar(str3));
    }


}
