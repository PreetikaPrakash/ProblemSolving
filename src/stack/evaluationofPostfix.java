package stack;

import java.util.Stack;

public class evaluationofPostfix {

    static int isoperand(char c){
        if(c=='+'|| c=='-'||c=='*'||c=='/'){
            return 1;
        }
        else{
            return 0;
        }
    }

    static int evaluatePostfix(String exp){
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int left =0;
        int right =0;
        char[] postfix = exp.toCharArray();
        for(int i=0;i<exp.length();i++){
           if(isoperand(postfix[i])==0){
               stack.push(postfix[i]-'0');
           }
           // else it is operator
           else{
               right = stack.pop();
               left = stack.pop();

               switch (postfix[i]){
                   case '+' : result = left + right; break;
                   case '-' : result = left - right; break;
                   case '*' : result = left * right; break;
                   case '/' : result = left / right; break;
               }stack.push(result) ;
           }
        }
         result = stack.peek();
        return result;
    }


    public static void main(String[] args) {
        String str1 = "231*+9-";//-4
        String str2 = "123+*8-"; // -3
        System.out.println("Evaluated to Postfix is "+ evaluatePostfix(str1));

        System.out.println("Evaluated to Postfix is "+ evaluatePostfix(str2));



    }
}
