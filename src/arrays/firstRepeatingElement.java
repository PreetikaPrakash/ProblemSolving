package arrays;

public class firstRepeatingElement {
    public static int firstRepeated(int[] arr, int n) {
        int j=0;
            for (int i = j; i < n - 1; i++) {
                if (arr[j] == arr[i+1]) {
                    return j + 1;
                }
                if (i==(n - 2)) {
                    j++;
                    i=j;
                    continue;
                }
                else {
                    continue;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        //int g = firstRepeated(new int[]{1,5,3,4,3,5,6},7);
        //int h = firstRepeated(new int[]{9,4,7,8,3,5,1,2,0,1,6},11);// 5
        int i = firstRepeated(new int[]{2,5,4,4,1,6,1,6,3},9);//3
        //System.out.println(g);
        System.out.println(i);
    }
}
