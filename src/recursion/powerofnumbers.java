package recursion;

public class powerofnumbers {
    public static long power(int base, int exponent) {
        if(exponent==0){
            return 1;
        }
        if(exponent%2==0){
            return power(base*base, exponent / 2);
        }
        else {
            return base * power(base*base, exponent / 2);
        }

    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
