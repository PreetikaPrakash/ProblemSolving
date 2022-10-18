package recursion;

public class decimal_toBinary {
    public static void fun2(int n){
        if(n==0){
            return;
        }
        else{
            fun2(n/2);
            System.out.printf("%d ",n%2);
        }
    }
    public static void main(String[] args) {
        fun2(7); // 111
    }
}
