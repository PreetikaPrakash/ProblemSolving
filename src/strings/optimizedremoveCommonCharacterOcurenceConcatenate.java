package strings;

public class optimizedremoveCommonCharacterOcurenceConcatenate {
    public static String concatenatedString(String s1,String s2)
    {
        String str ="";
        for(int i = 0;i<s1.length();i++){
            String s = String.valueOf(s1.charAt(i));
            if(!s2.contains(s)){
                str =str + s;
            }
        }
        for(int i = 0;i<s2.length();i++){
            String s = String.valueOf(s2.charAt(i));
            if(!s1.contains(s)){
                str =str + s;
            }
        }
        if(str.length()==0){
            str ="-1";
        }
        return str;
    }

    public static void main(String[] args) {
        String s1 = "aaccdb"; // 2,1,2,1
        String s2 = "gafd";
        System.out.println(concatenatedString(s1,s2));
        //ccbgf
    }
}
