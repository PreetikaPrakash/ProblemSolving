package stack;

public class immediateSmallerElement {

        void immediateSmaller(int arr[], int n) {
            for(int i=0;i<n-1;i++){ // 0-4
                if(arr[i]>arr[i+1]){// 0-1
                    arr[i] = arr[i+1];
                }
                else{
                    arr[i] = -1;
                }
            }
            arr[n-1] = -1;
        }
    }
// Input
/*
Input:
        N = 5
        Arr[] = {4, 2, 1, 5, 3}
Output:
2 1 -1 3 -1

*/
