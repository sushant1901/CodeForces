import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=0;
        int n=sc.nextInt();
        String s=sc.next();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A') a++;
            else b++;
        }
        if(a>b) System.out.println("Anton");
        else if (a<b) System.out.println("Danik");
        else System.out.println("Friendship");
        sc.close();


    }
}
