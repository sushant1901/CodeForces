
import java.util.*;
public class Solution54 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int a= sc.nextInt();
            String s= sc.next();
            int ans=0;
            for(int i=0;i<a;i++){
                ans=Math.max(ans,(s.charAt(i)-'a'));
            }

            System.out.println(ans+1);
        }
    }
}
