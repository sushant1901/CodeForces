import java.util.*;
public class Solution51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String str = sc.next();
            int q = 0;
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == 'Q') {
                    q++;
                }
                else {
                    q--;
                    q = Math.max(q,0);
                }
            }
            System.out.println(q > 0 ? "No" : "Yes");
        }
    }
}