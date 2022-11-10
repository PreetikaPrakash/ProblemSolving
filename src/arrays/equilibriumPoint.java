package arrays;

public class equilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
//        if(n==1){return 1;}
//        int prevSum = (int) arr[0];
//        int nextSum = (int) arr[n - 1];
//        int i = 1;
//        int j = n - 2;
//        while (i <= j) {
//            if (prevSum == nextSum) {
//                return i + 1;
//            } else {
//                prevSum = prevSum + (int) arr[i];
//                i++;
//                nextSum = nextSum + (int) arr[j];
//                j--;
//            }
//        }
//
//        return -1;

        // NEW APPROACH
        if(n==1){return 1;}
        long sum = 0;
        for(int i=0;i<n;i++){sum =sum+arr[i];}
        long l_sum=0;
        for(int i=0;i<n;i++){
            if(l_sum==sum-arr[i]){
                return i+1;
            }
            else{
                l_sum = l_sum + arr[i];
                sum = sum - arr[i];
            }
        }
        return -1;

    }
        public static void main(String[] args) {
        long arr1[] =new long[]{1,3,5,2,2}; // 3
        int yr = equilibriumPoint(arr1,5);
            System.out.println(yr);
        long arr2[] =new long[]{4, 42, 27, 16, 28, 3, 4, 5, 9, 3, 31, 5, 5, 29, 10, 18, 35, 35, 33, 19, 41, 23, 8 ,32, 9, 5, 8, 18, 35, 13, 6, 7, 6, 10, 11, 13, 37, 2, 25, 7, 28, 43};
        int yy = equilibriumPoint(arr2,42); // -1
        System.out.println(yy);

          long arr3[] =  new long[]{3,4,8,-9,20,6}; // 5
          int y = equilibriumPoint(arr3,6);
            System.out.println(y);

    }
}

