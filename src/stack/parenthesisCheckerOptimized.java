package stack;

import java.util.Stack;

class Solution
{
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();

        char[] arr= x.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('||arr[i]=='['||arr[i]=='{'){
                stack.push(arr[i]);
            }
            else if(arr[i]==')'|| arr[i]==']'||arr[i]=='}'){
                stack.pop();
            }
            else{continue;}
        }

        if(stack.empty()==true){
            return true;
        }
        else{
            return false;
        }
    }
}

public class parenthesisCheckerOptimized {
    public static void main(String[] args) {
        String st = "{([])}";
        if(new Solution().ispar(st)==true){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }

}
