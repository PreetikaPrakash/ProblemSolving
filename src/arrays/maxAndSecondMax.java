package arrays;

import java.util.ArrayList;

public class maxAndSecondMax {
    public static int maximum(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            continue;
        }
        return max;
    }
    public static int secondMax(int arr[]){
        int maxim = maximum(arr);
        int second = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==maxim){continue;}
            else if(arr[i]>second){
                second = arr[i];
            }
            else{continue;}
        }
        return second;
    }

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        // if N == 1 -> largest is the only number present , second = -1
        // if only 1 number is repeated that is max , second is -1 then
        // if secondMax same = take only one

        ArrayList<Integer> ar = new ArrayList<Integer>(sizeOfArray);
        if(sizeOfArray==1){
            ar.add(arr[0]);
            ar.add(-1);
        }
        else if(sizeOfArray>1){
            int max= maximum(arr);
            int seconds = secondMax(arr);
            ar.add(max);
            ar.add(seconds);
        }
        return ar;
    }


    public static void main(String[] args) {
        ArrayList<Integer> a = largestAndSecondLargest(3, new int[]{2,1,2});
        System.out.println(a);

        ArrayList<Integer> b = largestAndSecondLargest(1, new int[]{2});
        System.out.println(b);

        ArrayList<Integer> c = largestAndSecondLargest(3, new int[]{5,5,5});
        System.out.println(c);

        ArrayList<Integer> d = largestAndSecondLargest(4, new int[]{2,1,1,1});
        System.out.println(d);

        ArrayList<Integer> e = largestAndSecondLargest(10, new int[]{2,2,2,4,3,1,1,1,4,3});
        System.out.println(e);
    }
}
