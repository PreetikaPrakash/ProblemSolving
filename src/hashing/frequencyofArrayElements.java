package hashing;
import java.util.HashMap;
import java.util.Map;

public class frequencyofArrayElements {
    public static void main(String args[]){
        int arr[] = {10,12,10,15,10,20,12,12};
        frequencyofArrayElements fa = new frequencyofArrayElements();
        fa.freqencyElement(arr);
    }

    private void freqencyElement(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int x : arr){
            hs.put(x, hs.getOrDefault(x,0)+1);
        }
        // To retrieve the details from HashMap
        for(Map.Entry<Integer,Integer> e : hs.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
// OUTPUT
//20 1
//10 3
//12 3
//15 1