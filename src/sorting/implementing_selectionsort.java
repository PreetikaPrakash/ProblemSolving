package sorting;

public class implementing_selectionsort {
    public int[] selection(int arr[]){
        int i;
        int arr3[]=new int[arr.length];

        // Loop is running completely till last index
        for(i=0;i<arr.length;i++)
        {
            int end_place = arr.length-1-i;
            int maximum = maxValue(arr,end_place);

            arr3=swap(arr,maximum,end_place);
//            int j;
//            for(j=0;j<arr3.length;j++){
//                System.out.print(arr3[j]+ " "+ i);
//            }
//            System.out.println();
        }
        return arr3;
    }
    public int maxValue(int arr[],int last){
        int l;
        int m = arr[0];
        int index=0;
        for(l=1;l<last;l++)
        {
            if(arr[l]>m)
            {
                m = arr[l];
                index=l;
            }
            else{continue;}
        }
        return index;
    }
    public int[] swap(int arr[],int maxElement,int potential_end_place){
        int temp=arr[maxElement];
        arr[maxElement] = arr[potential_end_place];
        arr[potential_end_place]=temp;
        return arr;
    }

    public static void main(String[] args){

            int arr[] ={78,89,90,30,50};
            implementing_selectionsort is = new implementing_selectionsort();

            // Store the returned array into a new array
            int arr2[]=is.selection(arr);

            // Printout the new array
            int p;
            for(p=0;p<arr2.length;p++){
                System.out.print(arr2[p]+ " ");
            }

    }
}
