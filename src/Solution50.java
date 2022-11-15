import java.util.*;
public class Solution50
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int m=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]<m) {m=a[i];
                }
            }
            if(m==a[0]) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
