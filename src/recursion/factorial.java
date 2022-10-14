package recursion;

public class factorial {

    public int iterative_factorial(int n){
        int prod = 1;
        for(int i=1;i<=n;i++){
            prod = prod * i;
        }
        return prod;
    }
    public int recursive_factorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return recursive_factorial(n-1)*n;
        }
    }

    public static void main(String[] args){
        factorial f = new factorial();
        int n = 5;//120
        int m = 6;//720

        int q= f.iterative_factorial(n);
        System.out.println("iterative "+ q);

        q= f.recursive_factorial(m);
        System.out.println("recursive "+ q);
    }

}
