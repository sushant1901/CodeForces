import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int s= s1.compareToIgnoreCase(s2);
        if(s<0){
            System.out.println("-1");
        } else if (s>0) {
            System.out.println("1");
        }else System.out.println("0");
        sc.close();
    }
} //petya and String