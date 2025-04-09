package searching;

public class firstandlastoccurrenceofelement {
    public static int funcFirstOccurrence(int arr[],int start,int end,int element){
        int firstOccurrenceResult = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==element){
                firstOccurrenceResult = mid;
                end = mid-1;
            }
            else if(arr[mid]<element){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return firstOccurrenceResult;
    }
    public static int funcLastOccurrence(int arr[],int start,int end,int element){
        int lastOccurrenceResult = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==element){
                lastOccurrenceResult = mid;
                start = mid+1;
            }
            else if(arr[mid]<element){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return lastOccurrenceResult;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,10,10,10,18,20};
        int start = 0;
        int end = arr.length-1;
        int element = 10;
        int firstOccurrenceAt = funcFirstOccurrence(arr,start,end,element);
        int lastOccurrenceAt = funcLastOccurrence(arr,start,end,element);
        System.out.println("First occurrence of " + element + " is " + firstOccurrenceAt);
        System.out.println("Last occurrence of " + element + " is " + lastOccurrenceAt);
    }
}
// OUTPUT
// First occurrence of 10 is 2
// Last occurrence of 10 is 4