package searching;

public class searchingElementinSortedRotatedArray {
    public static void main(String[] args) {
        int arr[]={11,12,15,18,2,5,6,8};
        searchingElementinSortedRotatedArray sr = new searchingElementinSortedRotatedArray();
        int start = 0;
        int end = arr.length-1;
        int element = 15;
        int result = sr.searchElement(arr,element,start,end);
        System.out.println("Element was found at "+ result +" position");
    }

    private int searchElement(int[] arr, int element, int start, int end) {
        // Step 1 : find minimum element
        int findminElement = findMinimumElement(arr,start,end);
        System.out.println("minimum element is found at index "+ findminElement);
        // Step 2 : Binary Search on left of minimum element array
        int LeftArrayResult = SearchOnLeftArray(arr,element,start,findminElement-1);
        // Step 3 : Binary Search on right of minimum element array
        int RightArrayResult = SearchOnRightArray(arr,element,findminElement+1,end);
        if(LeftArrayResult > -1){
            return LeftArrayResult;
        }
        else{
            return RightArrayResult;
        }
    }

    private int SearchOnRightArray(int[] arr, int element, int start, int end) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==element){
                return mid;
            }
            if(element>=arr[mid]){
                start = mid + 1;

            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }

    private int SearchOnLeftArray(int[] arr, int element, int start, int end) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==element){
                return mid;
            }
            if(element>=arr[mid]){
                start = mid + 1;

            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    private int findMinimumElement(int[] arr, int start, int end) {
        int N = arr.length;
        while(start<=end){
            // if array is already sorted
            if(arr[start]<=arr[end]){
                return start;
            }
            int mid = start + (end-start)/2;
            int prev = (mid+N-1)%N;
            int next = (mid+1)%N;
            // checking if the mid element is smaller than its neighbours
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }
            if(arr[start]>=arr[mid]){
                end = mid - 1;

            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
