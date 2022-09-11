import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(true){
            count++;
            a*=3;
            b*=2;
            if(a>b){
                System.out.println(count);
                break;
            }

        }

    }
}
