package arrays;

public class minimumAdjacentDifferenceCircularArray {
    public static int minAdjDiff(int arr[], int n) {
        int min = arr[n-1] - arr[0];
        min = Math.abs(min); // imp
        for(int i=0;i<n-1;i++){
            int cal = arr[i] - arr[i+1];
            cal = Math.abs(cal); // imp
            System.out.print(cal+" ");
            if(cal<min){
                min = cal;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {70, 93, 59, 35, 4, 98, 94, 45, 89, 18, 13, 75, 55, 28, 48, 52, 24, 96, 91, 38, 38, 19, 18, 42, 87, 48, 84, 92, 20, 62, 9, 74, 36, 11, 57, 41, 52, 31, 37, 43, 72, 34, 60, 51};
        int y = minAdjDiff(arr, 44);
        System.out.println(y);

        int arr1[] = new int[]{10,-3,-4,7,6,5,-4,-1};
        y = minAdjDiff(arr1,8);
        System.out.println(y);

    }
}
