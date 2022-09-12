import java.util.Locale;
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int upperCase = 0;
        int lowerCase = 0;
        char[] ch = s.toCharArray();
        for(char chh : ch) {
            if (chh >= 'A' && chh <= 'Z') {
                upperCase++;
            } else if (chh >= 'a' && chh <= 'z') {
                lowerCase++;
            } else {
                continue;
            }
        }
        if (upperCase>lowerCase)
            System.out.println(s.toUpperCase());
        else if (upperCase==lowerCase)
            System.out.println(s.toLowerCase());
        else
            System.out.println(s.toLowerCase());
        sc.close();
    }
}
