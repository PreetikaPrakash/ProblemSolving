//OBJECTIVE
/*We have a number of bunnies and each bunny has two big floppy ears.
We want to compute the total number of ears across all the bunnies recursively
(without loops or multiplication).
bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/
package recursion;

public class bunnyEars {
    public int count = 0;
    public int iterative_bunnyEars(int n){
        int prod = 0;
        for(int i=1;i<=n;i++){
            prod = prod + 2;
        }
        return prod;
    }
    public int recursive_bunnyEars(int n){
        if(n==0){
            return count;
        }
        else {
            count = count + 2;
            return recursive_bunnyEars(n-1);
        }
    }

    public static void main(String[] args){
        bunnyEars f = new bunnyEars();
        int n = 5;//10
        int m = 8;//16

        int q= f.iterative_bunnyEars(n);
        System.out.println("iterative "+ q);

        q= f.recursive_bunnyEars(m);
        System.out.println("recursive "+ q);
    }
}

// Output
/*
iterative 10
recursive 16
*/