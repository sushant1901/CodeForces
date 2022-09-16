import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        int i=0;
        int j=0;
        int flag=0;
        if(s.length()!= t.length()) System.out.println("NO");
        else{
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        for ( i=0 ,j=s.length()-1; i<s.length(); i++,j--) {
            if (s1[i] == s2[j])
                flag++;
        }
            if(flag== s.length()) System.out.println("YES");
            else System.out.println("NO");


        }


    }
}
