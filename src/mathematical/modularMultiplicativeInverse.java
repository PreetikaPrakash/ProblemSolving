package mathematical;

public class modularMultiplicativeInverse {
    public int modInverse(int a, int m)
    {
        for(int i=1;i<m;i++){
            if((i*a)%m==1)
                return i;
        }
        return -1;
    }
}
/*
Input:
a = 3
m = 11
Output: 4
Explanation: Since (4*3) mod 11 = 1, 4
is modulo inverse of 3. One might think,
15 also as a valid output as "(15*3)
mod 11"  is also 1, but 15 is not in
ring {0, 1, 2, ... 10}, so not valid.

* */