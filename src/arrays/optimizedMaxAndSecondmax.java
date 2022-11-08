package arrays;
// APPROACH
// 5 8 12 20 - largest=20, second =12
// 5 8 12 12 - ignore
// 12 12 12 7 - uptil now -1 was second
// 12 8 12 7 - normal
// 12 7 12 9 - largest=12, second=9

public class optimizedMaxAndSecondmax {

    public static void maximum(int arr[]){
        int second = -1;
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]> largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]!=largest){
                if(arr[i]>second){
                    second = arr[i];
                }
            }
        }
        System.out.println("largest "+ largest);
        System.out.println("second largest " + second + "\n" );
    }


    public static void main(String[] args) {

        maximum(new int[]{5, 8, 12, 20});
        maximum(new int[]{5, 8, 12, 12});
        maximum(new int[]{12,12,12, 7});
        maximum(new int[]{12, 8, 12, 7});
        maximum(new int[]{12, 7, 12, 9});
    }

}

//OUTPUT
/*
largest 20
second largest 12

largest 12
second largest 8

largest 12
second largest 7

largest 12
second largest 8

largest 12
second largest 9


Process finished with exit code 0

* */