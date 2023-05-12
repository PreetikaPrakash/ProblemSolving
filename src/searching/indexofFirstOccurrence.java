package searching;

public class indexofFirstOccurrence {

    private static int iterativefirstoccurrence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;

            } else if (arr[mid] > key) {
                high = mid - 1;
            }
            else {
                if (arr[mid - 1] != arr[mid] || mid ==0) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }

        public static void main (String[]args){
            int[] arr1 = {20, 20, 20, 20, 20, 20, 40};//4
            int keys = 20;

            System.out.println(iterativefirstoccurrence(arr1, keys));

        }
    }

