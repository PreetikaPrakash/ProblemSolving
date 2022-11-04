package arrays;
/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
*/
public class returnPItoArray {
    public static void main(String[] args) {
        int arr[]= new int[3];
        int i=2;
        double y = 3.14;
        int PI = (int)(y*100);

        while(PI>0 && i>=0 ){
            int rem = PI%10;
            arr[i] = rem;
            i--;
            PI = PI/10;
        }
        for(int j = 0 ; j<arr.length;j++){
            System.out.print(arr[j]);
        }
    }
}
