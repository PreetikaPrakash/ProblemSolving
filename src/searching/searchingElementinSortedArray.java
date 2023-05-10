package searching;

public class searchingElementinSortedArray {
    static int searchInSorted(int arr[], int N, int K) {

        int low = 0;
        int high = N;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == K) {
                return 1;
            } else if (arr[mid] < K) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int N = 5;
        int K = 6;
        System.out.println(searchInSorted(arr, N, K));

    }
}
