package recursion;

import java.util.ArrayList;
import java.util.List;

public class exponent {
    //n = base
    //m = exponent
    public static int powers(int n, int m){
        if(m==0){
            return 1;
        }
        if(m%2==0){
            return powers(n*n,m/2);
        }
        else{
            return n * powers(n*n,(m-1)/2);
        }
    }
    public static void main(String[] args){
        System.out.println(powers(2,11));


    }
}
