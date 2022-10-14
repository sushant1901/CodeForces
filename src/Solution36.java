import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int ans=n/100;
        int rem=n%100;

        ans+= rem/20;
       rem =rem%20;

       ans+= rem/10;
       rem =rem%10;

       ans+=rem/5;
       rem =rem%5;

       ans+=rem/1;

        System.out.println(ans);

    }
}
