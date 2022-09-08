import java.util.*;
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            String s = sc.nextLine();
            int n = s.length();
            if (n > 10) {

                String str=""+s.charAt(0)+(n-2)+s.charAt(n-1);
                System.out.println(str);
            } else {
                System.out.println(s);
            }

        }

    }
}
//
Way Too Long Words
