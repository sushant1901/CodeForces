import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2];
        int count=0;
       for (int i=0;i<n;i++){
           int a=sc.nextInt();
           int b=sc.nextInt();
           if(b-a>=2){
               count++;
           }

       }
        System.out.println(count);
    }
}
