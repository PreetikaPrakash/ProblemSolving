package recursion;

public class pattern_1213121 {

    public static void fun2(int n){
        if(n==0){
            return;
        }
        else{
            fun2(n-1);
            System.out.printf("%d ",n);
            fun2(n-1);
        }
    }
    public static void main(String[] args) {
        fun2(3);
    }
}
