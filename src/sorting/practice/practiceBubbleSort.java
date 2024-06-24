package sorting.practice;

public class practiceBubbleSort {

    public static void main(String[] args){
        int arr[] = {40,30,90,10};
        int temp = 0;
        int n = arr.length;
        for(int i =0; i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }

// Output
// 10 30 40 90





}
