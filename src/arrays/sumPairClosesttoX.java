package arrays;

import java.util.Arrays;

public class sumPairClosesttoX {

    static int[] sumClosest(int[] arr, int x) {
        if(arr.length==2){
            return arr;
        }
        int[] arr2 = new int[arr.length];
        int prevSum=x;
        int newSum=0;
        int pair1element = 0;
        int pair2element = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                newSum = x - (arr[i]+arr[j]);
                if(prevSum>=newSum && newSum>0){
                    if(newSum==0){
                        pair1element=arr[i];
                        pair2element=arr[j];
                        break;
                    }
                    else{
                        prevSum=newSum;
                        pair1element=arr[i];
                        pair2element=arr[j];
                    }
                }
            }
        }
        arr2[0]=pair1element;
        arr2[1]=pair2element;
        return arr2;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumClosest(new int[]{10, 22, 28, 29, 30, 40},54)));
        System.out.println(Arrays.toString(sumClosest(new int[]{0,5,8,24,32,33,35,37,39,39,45,5157,71,71,71,74,86,95,95},111)));
    }
}
