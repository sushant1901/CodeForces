import java.util.*;
public class Solution52{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int a = n/2+1; int b=1;

            for(int i=1; i<=n/2; i++){
                System.out.print(a+" "+b+" ");
                a++; b++;
            }
            if(n % 2 != 0){
                System.out.print(a);
                System.out.println();
            }
        }
    }
}