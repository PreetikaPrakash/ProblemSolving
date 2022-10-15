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

    public int prod = 0;
    public int recursive_bunnyEarsTwo(int bunnies) {
        int count = 0;
        count = prod;
        if (bunnies == 0) {
            prod = 0;
            return count;
        } else {
            prod = prod + 2;
            return recursive_bunnyEarsTwo(bunnies - 1);
        }
    }
    public int recursive_bunnyEarsThree(int n){
        if(n==0){
            return 0;
        }
        else {
            return recursive_bunnyEarsThree(n-1) + 2;
        }
    }

    public static void main(String[] args){
        bunnyEars f = new bunnyEars();
        int n = 5;//10
        int m = 8;//16
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int p = 4;

        int q= f.iterative_bunnyEars(n);
        System.out.println("iterative "+ q); //10

        q= f.recursive_bunnyEars(m);
        System.out.println("recursive function one"+ q); // 16

        q= f.recursive_bunnyEarsTwo(a);
        System.out.println("recursive function two a "+ q);// 0
        q= f.recursive_bunnyEarsTwo(b);
        System.out.println("recursive function two b "+ q);// 2
        q= f.recursive_bunnyEarsTwo(c);
        System.out.println("recursive function two c "+ q); // 4
        q= f.recursive_bunnyEarsTwo(d);
        System.out.println("recursive function two d "+ q); //6

        q=f.recursive_bunnyEarsThree(p);
        System.out.println("recursive function three "+ q); // 8
    }
}

// Output
/*
iterative 10
recursive 16
a 0
b 2
c 6
d 12
8
*/