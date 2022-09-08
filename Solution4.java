import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if((x==1 && y==1) || (y==1 &&z==1)||(z==1&& x==1)){
                s++;
            }
        }
        System.out.println(s);


    }


}
//Team