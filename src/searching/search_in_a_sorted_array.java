package searching;

import java.util.Scanner;

public class search_in_a_sorted_array {
    static int searchInSorted(int arr[], int N, int K)
    {
        // Applying Binary Search
        int low,high=0;
        low=0;
        high=N-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == K) {
                return 1;
            } else if (arr[mid] > K) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // How many elements to be entered in array
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // User input for array elements
        int arr[] = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i]=sc.nextInt();
        }

        // User input for the Key
        int K = sc.nextInt();

        int result = searchInSorted(arr,N,K);
        System.out.println(result);
    }
}
