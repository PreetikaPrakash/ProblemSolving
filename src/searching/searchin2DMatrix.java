package searching;

public class searchin2DMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50},
        };
        int i = 0;
        int j = arr.length-1;
        int key = 29;
        searchin2DMatrix sd = new searchin2DMatrix();
        int arr2[] = sd.findElement(arr,key,i,j);
        System.out.println("Element is found at index "+ "["+arr2[0]+","+ arr2[1]+"]");
    }

    private int[] findElement(int[][] arr, int key, int i, int j) {
        while(i>=0 && i<arr.length && j>=0 && j<arr.length){
            if(arr[i][j]==key){
                return new int[] {i,j};
            }
            else if(arr[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
// OUTPUT : Element is found at index [2,1]