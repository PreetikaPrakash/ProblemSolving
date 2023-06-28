package arrays;

public class reaarangeArrayAlternately {

    static void rearrange(long arr[], int n){
        int left = 0;
        int right = n-1;
        long[] arrnew = new long[n];
        int ii=0;

        while(left<right){
            arrnew[ii++]=arr[right];
            arrnew[ii++]=arr[left];
            right--;
            left++;
        }
        if(n%2!=0){
            arrnew[ii]=arr[left];
        }

        for(int i=0;i<n;i++){
            arr[i]=arrnew[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        long[] arr1 = {1,2,3,4,5,6};
        long[] arr2 = {10,20,30,40,50,60,70,80,90,100,110};

        rearrange(arr1,arr1.length);
        System.out.println();
        rearrange(arr2,arr2.length);

    }
}

/*OUTPUT
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60
* */