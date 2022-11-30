import java.util.*;
public class Solution57
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((Math.abs(a-b)+9)/10);
        }
    }
}