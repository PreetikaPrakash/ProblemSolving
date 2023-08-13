package searching;

public class roofTop {
    public static void main(String[] args) {
        static int maxStep(int A[], int N)
        {
            int count = 0;
            int zount = 0;


            for(int i=0;i<N-1;i++){
                if(A[i+1]>A[i])

                {count++;
                    if(count>zount){
                        zount = count;
                    }}
                else{
                    count = 0;
                }
            }
            return zount;
        }

    }

}

/*
* Input: N = 4 A[] = {1,2,3,4} Output: 3 Explanation: 1 to 2 to 3 to 4 is the jump of
* length 3 to have maximum number of buildings with increasing heights,
* so maximum steps with increasing altitude becomes 3.
* */
