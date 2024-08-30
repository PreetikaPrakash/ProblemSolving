package arrays;

public class cyclicrotatearrayoptimized {
    public void rotate(int[] arr) {
        int last_element = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last_element;
    }
}

/*
* Time Complexity: O(n)
Space Complexity: O(1)
* */