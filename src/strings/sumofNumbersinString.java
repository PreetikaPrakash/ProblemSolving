// to convert character to integer  -> ch[i] - '0';
package strings;

public class sumofNumbersinString {

    public static void findSum(String str){
        char[] ch = str.toCharArray();
        int num = 0;
        int sum = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0'&& ch[i]<='9')
            {
                num = (num*10) + (ch[i]-'0');
            }
            else{
                sum = sum + num;
                num = 0;
            }
        }
        System.out.println(sum+num);

    }

    public static void main(String[] args) {
        String str1 = "1abc23";
        String str2 = "geeks4geeks";
        findSum(str1);
        //System.out.println(findSum(str2));

    }
}
