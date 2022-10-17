// OBJECTIVE
/*
Input1 -> 1
Output1 -> 1 1 1

Input2 -> 2
Output2 -> 2 1 1 1 2 1 1 1 2

Input2 -> 3
Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
* */
package recursion;

import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n + " ");
            pzz(n-1);
            System.out.print(n + " ");
            pzz(n-1);
            System.out.print(n + " ");
        }

    }
}
