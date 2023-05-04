package arrays;
// rest code gfg
// Time Complexity = O(n) , not expected O(logn)

public class peakElement {
    public static int peakElement(int[] arr,int n)
    {
        if(n==1){
            return 0;
        }
        if(arr[n-1]>=arr[n-2]){
            return n-1;
        }
        if(arr[0]>=arr[1]){
            return 0;
        }
        else{
            for(int i=1;i<n-1;i++){
                if((arr[i]>=arr[i+1]) && (arr[i]>=arr[i-1])){
                    return i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int firstElement = peakElement(new int[]{4,2,3},3);
        int lastElement = peakElement(new int[]{1,13},2);
        int midElement = peakElement(new int[]{1,4,3},3);
        //int midElement = peakElement(new int[]{1,1,1},3);

        System.out.println("firstelement " + firstElement);
        System.out.println("lastelement " + lastElement);
        System.out.println("midelement " + midElement);
    }
}
