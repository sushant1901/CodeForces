import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        char[] res= new char[s1.length()];
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        for(int i=0;i<s1.length();i++){
            if(c1[i]==c2[i]){
                res[i]='0';
            }
            else
                res[i]='1';
        }
        System.out.println(res);



    }
}
