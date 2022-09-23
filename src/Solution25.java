import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a= sc.nextLong();
        if(a%2==0){
            System.out.println(a/2);
        }else {
            long d= (a/2 +1)*(-1);
            System.out.println(d);
        }
        sc.close();
    }

}
