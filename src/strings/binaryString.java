package strings;

public class binaryString {
    public static void main(String[] args) {
        // Brute Force
        // Time Complexity : O(N^2)
    {
        String str ="00100101";
        char[] ch1 = str.toCharArray();
        int count =0;

        for(int i=0;i<ch1.length-1;i++){
                    if(ch1[i]=='1'){
                        for(int j=i+1;j<ch1.length;j++){
                            if(ch1[j]=='1'){
                                count++;
                            }
                        }
                    }
        }
        System.out.println(count);
    }
         // Optimized Approach
        // Time Complexity : O(N)
    {
        String str ="1111";
        char[] ch = str.toCharArray();
        int count = 0;

        for(int i=0;i<str.length();i++){
            if(ch[i]=='1'){
                count++;
            }
        }
        System.out.println((count*(count-1))/2);
    }
    }
}
// OUTPUT
// 3
// 6
