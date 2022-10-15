package recursion;
//OBJECTIVE
// Count number of 7's
// (717) -> 2
public class count7 {
    int count=0;
    public int countno7(int num){
        if(num==0){
            return count;
        }
        else{
            if (num%10==7) {count++;}
            return countno7(num/10);
        }

    }
    public static void main(String[] args){
        int num = 717;
        count7 c= new count7();
        int result = c.countno7(num);
        System.out.println(result);
    }
}

// OUTPUT
// 2