package arrays;

import java.util.*;

public class leadersInArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        al.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max || arr[i]==max){ // arr[i]==max is missed initially
                max = arr[i];
                al.add(max);
            }
            else{continue;}
        }

        Collections.reverse(al);
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> aw;
        int arr[] ={16,17,4,3,5,2};
        aw = leaders(arr,6);
        System.out.println(aw);

        int arr1[] ={1,2,3,4,0};
        aw = leaders(arr1,5);
        System.out.println(aw);

        int arr2[] ={16, 17, 3, 18, 0};
        aw = leaders(arr2,5);
        System.out.println(aw);

        int arr3[] ={23, 17, 3, 18, 0};
        aw = leaders(arr3,5);
        System.out.println(aw);

        int arr4[] ={23, 22, 21, 20, 0};
        aw = leaders(arr4,5);
        System.out.println(aw);

        int arr5[] ={23, 22, 28, 20, 0};
        aw = leaders(arr5,5);
        System.out.println(aw);


    }
}


// OUTPUT
/*
[17, 5, 2]
[4, 0]
[18, 0]
[23, 18, 0]
[23, 22, 21, 20, 0]
[28, 20, 0]
 */