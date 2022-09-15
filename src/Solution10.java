import java.util.Scanner;
public class Solution10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        char z= s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(z==s.charAt(i)){
                count++;

            }
            z= s.charAt(i);
        }

        System.out.println(count);
        sc.close();
    }
}
