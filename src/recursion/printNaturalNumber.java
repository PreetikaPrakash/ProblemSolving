package recursion;
public class printNaturalNumber {
    public static int prints(int num){
        if(num==0){
            return 1;
        }
        else{
            prints(num-1);
            System.out.printf("%d ",num);
        }
        return 0;
    }
    public static void main(String[] args){
        prints(10);

    }
}
