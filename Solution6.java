import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String cap = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        System.out.println(cap);
        sc.close();

    }
}
//Word Capitalization