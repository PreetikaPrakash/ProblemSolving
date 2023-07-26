package stack;

public class implementTwoStacksinArray {
    class twoStacks {
        int arr[];
        int size;
        int top1, top2;

        twoStacks() {
            size = 100;
            arr = new int[100];
            top1 = -1;
            top2 = size;
        }

        //Function to push an integer into the stack1.
        void push1(int x) {
            top1++;
            arr[top1] = x;

        }

        //Function to push an integer into the stack2.
        void push2(int x) {
            top2--;
            arr[top2] = x;


        }

        //Function to remove an element from top of the stack1.
        int pop1() {
            if (top1 == -1) {
                return -1;
            } else {

                int result1 = arr[top1];
                top1--;
                return result1;
            }
        }

        //Function to remove an element from top of the stack2.
        int pop2() {
            if (top2 == size) {
                return -1;
            }
            int result2 = arr[top2];
            top2++;
            return result2;
        }
    }
}
/*
Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()

Output:
3 4 -1

Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence returned -1.
* */
