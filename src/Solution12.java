import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int res=x/5;

        if(x%5==0){
            System.out.println(res);
        }else {
            System.out.println(res+1);
        }
        sc.close();
    }
}
