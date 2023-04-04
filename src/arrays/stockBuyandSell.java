package arrays;

import java.util.ArrayList;

public class stockBuyandSell {
    static ArrayList<Integer> stockBuySell(int[] A, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int j=0;
        int sell_value=0;
        int profit = 0;
        int past_profit = 0;

        for(int i=0;i<n;i++) {
            j=i;
            while (A[i] < A[j + 1]) {
                j++;
            }
            sell_value = A[j - 1];


            profit = sell_value-A[i];
        }
        past_profit = profit;
        if(past_profit>profit){
            profit = past_profit;
        }
        return al;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ak = new ArrayList<>();
        int A[]={100,180,260,310,40,535,695};
        int AA[]={4,2,2,2,4};
        //ak = stockBuySell(A,7);
    }
}
