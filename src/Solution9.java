import java.util.Scanner;
import java.util.*;

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        Set<Character> charSet=new HashSet<>();
        for(int i=0;i<s.length();i++){
            charSet.add(s.charAt(i));
        }
        if(charSet.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else  System.out.println("IGNORE HIM!");

    }
}
