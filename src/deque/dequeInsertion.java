package deque;

import java.util.ArrayDeque;

public class dequeInsertion {
    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            ad.add(arr[i]);
        }
        return ad;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> add = deque_Init(new int[]{1,2,3,4,7},5);
        // FIFO
        while(!add.isEmpty()){
            System.out.print(add.remove()+" ");
        }
    }
}
//OUTPUT
// 1 2 3 4 7
