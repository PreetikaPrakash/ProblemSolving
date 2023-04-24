package arrays;
// Submitted in GFG
public class sortarrayof0s1s2s {
    public static void sort012(int a[], int n)
    {
        int zero_count=0;
        int one_count=0;
        int two_count=0;

        for(int i=0;i<n;i++){
            if(a[i]==0){zero_count++;}
            if(a[i]==1){one_count++;}
            if(a[i]==2){two_count++;}
        }

        int j=0;
        // for zero's
        while(zero_count>0){
            a[j] = 0;
            j++;
            zero_count--;
        }
        // for one's
        while(one_count>0){
            a[j] = 1;
            j++;
            one_count--;
        }
        // for two's
        while(two_count>0){
            a[j] = 2;
            j++;
            two_count--;
        }
    }
}
