import java.util.Scanner;
public class Solution49{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int i=1,j=3*n;
            System.out.println((n+1)/2);
            while(i<j){
                System.out.println(i);
                System.out.println(j);
                i+=3;
                j-=3;
            }
        }
    }
}