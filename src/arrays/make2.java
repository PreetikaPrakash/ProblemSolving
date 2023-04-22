package arrays;

public class make2 {
    public static int[] make2(int[] a, int[] b) {
        int aLen = a.length;
        int newArr[] = new int[2];
        if(aLen==2){
            return a;
        }
        if(aLen==1){
            newArr[0] = a[0];
            newArr[1] = b[0];
            return newArr;
        }
        if(aLen==0){
            newArr[0] = b[0];
            newArr[1] = b[1];
            return newArr;
        }
        if(aLen>2){
            newArr[0] = a[0];
            newArr[1] = a[1];
            return newArr;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr1[] = {4,5};
        int arr2[] = {1,2,3};
        int arr3[] = {4};
        int arr4[] = {1,2,3};
        int arr5[] = {};
        int arr6[] = {1,2};
        int arr7[] = make2(arr1,arr2);
        int arr8[] = make2(arr3, arr4);
        int arr9[] = make2(arr5,arr6);
        for(int i = 0 ; i<2;i++){
            System.out.printf("%d    ",arr7[i]);
        }
        System.out.println();

        for(int i = 0 ; i<2;i++){
            System.out.printf("%d ",arr8[i]);
        }
        System.out.println();

        for(int i = 0 ; i<2;i++){
            System.out.printf("%d ",arr9[i]);
        }
    }
}

