// OBJECTIVE
/*
Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5
* */
package recursion;

public class countDigits {
    public static int count=1;
    public static int countDigitsMethod(int n)
    {
        if(n<=9) { // this was imp
            int p = count;
            count = 1;
            return p;
        }
        else{
            count ++;
            return countDigitsMethod(n/10);
        }
    }
    public static void main(String[] args){
        System.out.println(countDigitsMethod(99999));
        System.out.println(countDigitsMethod(0));
        System.out.println(countDigitsMethod(1));
        System.out.println(countDigitsMethod(22));
        System.out.println(countDigitsMethod(361));
    }
}

// OUTPUT
/*
5
1
1
2
3

* */