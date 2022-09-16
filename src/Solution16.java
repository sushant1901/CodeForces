import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int max=0;
        while(n-->0){
             int a=sc.nextInt();
             int b=sc.nextInt();
             p=b-a+p;
             if(max<p) max=p;
        }
        System.out.println(max);
        sc.close();
    }
}
