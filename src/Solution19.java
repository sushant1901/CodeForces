import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        while(true){
            year+=1;
            int a=year/1000;
            int b=year/100 %10;
            int c=year/10 %10;
            int d=year%10;
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                System.out.println(year);
                return;

            }
        }

    }

}
