import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int count=n;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a>h){
               count++;
            }
        }
        System.out.println(count);
    }
}
