// GFG - Peak element
// Time Complexity = O(N)
package arrays;
public class peakElement2 {


        public int peakElement(int[] arr,int n)
        {

            for(int i=0;i<n-1;i++){
                if((arr[i]>arr[i+1])||(arr[i]==arr[i+1])){
                    return i;
                }
                else{
                    continue;
                }
            }
            return n-1;
        }

}

