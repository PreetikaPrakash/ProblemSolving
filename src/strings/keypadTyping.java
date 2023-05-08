package strings;

public class keypadTyping {

    public static String printNumber(String s, int n)
    {
        String str="";
        char[] ss =s.toCharArray();
        for(int i=0;i<n;i++){
            if(ss[i]=='A'||ss[i]=='B'||ss[i]=='C'||ss[i]=='a'||ss[i]=='b'||ss[i]=='c'){
                str=str+2;
            }
            else if(ss[i]=='D'||ss[i]=='E'||ss[i]=='F'||ss[i]=='d'||ss[i]=='e'||ss[i]=='f'){
                str=str+3;
            }
            else if(ss[i]=='G'||ss[i]=='H'||ss[i]=='I'||ss[i]=='g'||ss[i]=='h'||ss[i]=='i'){
                str=str+4;
            }
            else if(ss[i]=='J'||ss[i]=='K'||ss[i]=='L'||ss[i]=='j'||ss[i]=='k'||ss[i]=='l'){
                str=str+5;
            }
            else if(ss[i]=='M'||ss[i]=='N'||ss[i]=='O'||ss[i]=='m'||ss[i]=='n'||ss[i]=='o'){
                str=str+6;
            }
            else if(ss[i]=='P'||ss[i]=='Q'||ss[i]=='R'||ss[i]=='S'||ss[i]=='p'||ss[i]=='q'||ss[i]=='r'||ss[i]=='s'){
                str=str+7;
            }
            else if(ss[i]=='T'|ss[i]=='U'||ss[i]=='V'||ss[i]=='t'||ss[i]=='u'||ss[i]=='v'){
                str=str+8;
            }
            else{
                str=str+9;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String y= printNumber(new String("geeksforgeeks"),13);
        System.out.println(y);
    }
}

//OUTPUT = 4335736743357
