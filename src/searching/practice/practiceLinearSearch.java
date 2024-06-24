package searching.practice;

public class practiceLinearSearch {

    public static void main(String[] args){

        // LINEAR SEARCH in ARRAYS
            int arr[] ={4,15,6,7,19,11};
            int element = 16;
            int temp = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==element){
                    System.out.println("Position of element is " + i);
                    temp+=1;
                }
            }
            if(temp==0) {
                System.out.println("Element not present in array");
            }

        //--------------------------------------------------------------------------------------------------


        // LINEAR SEARCH in STRINGS
            String Strarr[] ={"mercury","venus","jupiter","mars","saturn","earth"};
            String Strelement = "mars";
            int Strtemp = 0;
            for(int i=0;i<Strarr.length;i++){
                if(Strarr[i]==Strelement){
                    System.out.println("Position of element is " + i);
                    Strtemp+=1;
                }
            }
            if(Strtemp==0) {
                System.out.println("Element not present in array");
            }
    }
}
