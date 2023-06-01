package mathematical;

public class primalityTest {
    public static boolean isPrime(int N) {
        if(N==1){return false;}
        int count = 0;
        int k = (int)Math.sqrt(N);
        for(int i=2;i<=k;i++){
            if(N%i==0){
                count =1;
                break;
            }
        }
        if(count==1){return false;}
        else{return true;}

    }

    public static void main(String[] args) {
        if(isPrime(17)==true){System.out.println("Yes");}
        else{System.out.println("No");}
    }
}
