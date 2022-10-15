// OBJECTIVE
/*Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
so powerN(3, 2) is 9 (3 squared).
        powerN(3, 1) → 3
        powerN(3, 2) → 9
        powerN(3, 3) → 27
*/
package recursion;
public class powerN {
    public static int powerN(int base, int n) {
        if(n==0){
            return 1; }
        else{
            return powerN(base,n-1)*base; } }
    public static void main(String[] args){
        System.out.println("Value " +powerN(3,3) ); }
}
// OUTPUT
// Value 27