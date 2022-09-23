import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  n= sc.nextInt();
        int sum=0;
        int a=0;
         for(int i=0;i<n;i++){
             a=sc.nextInt();
             sum+=a;
         }
        System.out.println((double) sum/n);
    }
}
