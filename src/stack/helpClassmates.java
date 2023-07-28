package stack;

public class helpClassmates {
    public static int[] help_classmate(int arr[], int n)
    {
        // Brute Force
        int k=0;
        boolean flag=false;
        int[] arr2 = new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                flag=false;
                if(arr[j]<arr[i]){
                    arr2[k++]=arr[j];
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                arr2[k++] = -1;
            }

        }
        arr2[k] = -1;
        return arr2;
    }
}

/*
Input: N = 5, arr[] = {3, 8, 5, 2, 25}

Output: 2 5 2 -1 -1

Explanation:
1. Roll number 1 has 3 marks. The first person
who has less marks than him is roll number 4,
who has 2 marks.
2. Roll number 2 has 8 marks, he helps student
with 5 marks.
3. Roll number 3 has 5 marks, he helps student
with 2 marks.
4. Roll number 4 and 5 can not pick anyone as
no student with higher roll number has lesser
marks than them. This is denoted by -1.
Output shows the marks of the weaker student that
each roll number helps in order. ie- 2,5,2,-1,-1

* */