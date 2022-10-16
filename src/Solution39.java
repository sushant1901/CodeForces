import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==1 || n==2){
                System.out.println("0");
            } else if (n%2==0) {
                System.out.println((n/2)-1);
            }else System.out.println(n/2);
        }
        sc.close();
    }
}
