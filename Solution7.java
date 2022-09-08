import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int count1=0;
        int count2=0;
        int count3=0;
        String solution="";

        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1') count1++;
            else if (s.charAt(i) == '2') count2++;
            else if (s.charAt(i) == '3') count3++;
        }
        for(int j=0;j<count1;j++){
            solution=solution + "1+";
        }
        for(int j=0;j<count2;j++){
            solution=solution + "2+";
        }
        for(int j=0;j<count3;j++){
            solution=solution + "3+";
        }

        solution=solution.substring(0,s.length());
        System.out.println(solution);
    }
}
//Helpful Maths
