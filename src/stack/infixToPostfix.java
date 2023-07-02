package stack;
// Coverage + - * /
import java.util.Arrays;
import java.util.Stack;

public class infixToPostfix {


    // if character is a letter or any other symbol apart from [+,-,*,/] ---> return true;
    static int isOperand(char c){
        if(c=='+'||c=='-'||c=='*'||c=='/'){
            return 1;
        }
        else{
            return 0;
        }
    }
    static int precedence(char c){
        if(c=='+'||c=='-'){
            return 1;
        }
        else if(c=='*'||c=='/'){
            return 2;
        }
        else{
            return 0;
        }
    }


    public static String infixToPostfix(String exp) {
        Stack<Character> s_stack = new Stack<>();
        s_stack.push('#');
        //createStack(exp.length());
        exp = exp + '\0';
        char[] infix = exp.toCharArray();
        char[] postfix = new char[exp.length()];

        // traverse through infix expression
            // variable i is needed to traverse through infix expression
            // variable j is needed to traverse through postfix expression
            int i=0; int j=0;

        while(infix[i]!='\0'){
            // if element is operand directly add it to stack
            if(isOperand(infix[i])==0){
                postfix[j++] = infix[i++];
            }
            // if element is operator
                // 1. check if infix precedence is greater than stacktop then push to stack
                // 2. else if infix precendence is lower than stacktop pop out stack elements
            else{
                    if(precedence(infix[i])>precedence(s_stack.peek())){
                        s_stack.push(infix[i++]);
                    }
                else{
                    postfix[j++] = s_stack.pop();
                }
            }
        }

        // when infix expression is finished but still elements remain in stack
        while(!s_stack.isEmpty()){
            postfix[j++]= s_stack.pop();
        }
        String p = Arrays.toString(postfix);
        return p;
    }
    public static void main(String[] args){
        String str = "A*B+C/D";
        String result  = infixToPostfix(str);
        System.out.println("Postfix expression is "+ result);
    }

}

/*OUTPUT
Postfix expression is [A, B, *, C, D, /, +, #]
* */