package recursion;

import java.util.Scanner;
// SET = 1
// Not set = 0

public class setorNot {

    public static void main(String[] args){
        int num = 7; // 111
        int k = 3;
        String rem = "";
        while(num>0){
            rem =  String.valueOf((num%2))+rem ;
            num=num/2;
        }
        String s = rem.substring(k-1,k-2);
        System.out.println(s);
        if(s=="1"){
            System.out.println("SET");
        }
        System.out.println("UNSET");





    }
}
