package recursion;

public class digitalRoot {

    public static int digitalRoot(int n) {
        if(n==0){
            return 0;
        }
        else {
            return digitalRoot(n / 10) + (n % 10);
        }
    }

    public static int main(String[] args) {
        System.out.println(digitalRoot(999));
        return 0;
    }
}
