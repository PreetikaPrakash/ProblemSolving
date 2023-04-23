package arrays;

public class returnArrayfromMethod {

    public static int[] method1(int arr[]){
            arr[arr.length-1]=12;
        return arr;
    }

    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,0};
        int arr2[] = new int[6];
        arr2 = returnArrayfromMethod.method1(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }

}
