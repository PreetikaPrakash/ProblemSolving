package recursion;

import java.util.Scanner;

public class binary {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String rem = "";
        while(num>0){
            rem =  String.valueOf((num%2))+rem ;
            num=num/2;
        }
        System.out.println(rem);




    }
}
