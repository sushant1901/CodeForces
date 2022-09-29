import java.util.*;
public class Solution32 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int a=s.nextInt(), b=s.nextInt();
            System.out.println(a%b==0?"0":(b-a%b));
        }
    }
}