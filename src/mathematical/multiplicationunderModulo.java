// (a mod m) * (b mod m))mod m
package mathematical;
public class multiplicationunderModulo {
    static long multiplicationUnderModulo(long a, long b)
    {
        // long g= 10^9+7; // doesnt work
        long g = 1000000007;
        long h = a%g;
        long j = b%g;
        return (h*j)%g;
    }
    public static void main(String[] args) {

        long a= 92233720368547758L;
        long b = 92233720368547758L;
        System.out.println(multiplicationUnderModulo(a,b));


    }
}

// OUTPUT
//484266119