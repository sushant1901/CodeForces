import java.util.*;
public class Solution43
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,d,i,t=0;
        n = sc.nextInt();
        k = sc.nextInt();
        d = 240-k;
        for(i=1;i<=n;i++)
        {
            t += (5*i);
            if(t>d)
            {
                break;

            }
        }
        System.out.println(i-1);
    }
}
