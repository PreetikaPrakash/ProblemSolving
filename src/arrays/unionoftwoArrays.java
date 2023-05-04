package arrays;

import java.net.StandardSocketOptions;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class unionoftwoArrays {

        public static int doUnion(int a[], int n, int b[], int m) {
            // add elements to new array
            int[] c = new int[n + m];
            int j = 0;
            for (int i = 0; i < n; i++) {
                c[j++] = a[i];
            }
            for (int i = 0; i < m; i++) {
                c[j++] = b[i];
            }


            // count duplicates in this array
            j = 0;
            int count = 0;

            while (j < (n + m) - 2) {
                for (int i = j; i < (m + n) - 1; i++) {
                    if (c[j] == c[i + 1]) {
                        count++;
                    } else {
                        continue;
                    }
                }
                j++;
            }
            return (m + n) - count;




        }

            public static void main (String[]args){
                int res = unionoftwoArrays.doUnion(new int[]{85, 25, 1, 32, 54, 6}, 6, new int[]{85, 2}, 2);
                System.out.println(res);
            }

        }
