//OBJECTIVE
/*
-----Used Pascals Triangle------
FORMULA: ncr = n!/r!(n-r)!
n= 5 balls (A,B,C,D,E)
r= 3 random balls to choose, no repetition
ncr = 5!/3!(2)! => 10 ways to choose 3 random balls from 5 balls
*/
package recursion;

public class ncr_Combination {
    public static int ncr(int n, int r){
        if(n==r||r==0){
            return 1;
        }
        else{
            return ncr(n-1,r-1)+ncr(n-1,r);
        }
    }
    public static void main(String[] args){
        System.out.println(ncr(5,3));
    }
}

// OUTPUT
// 10