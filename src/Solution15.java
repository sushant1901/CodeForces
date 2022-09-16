import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        int flag=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='4' || n.charAt(i)=='7'){
                flag++;
            }
        }
        if(flag==4 || flag==7){
            System.out.println("YES");
        }else System.out.println("NO");

    }
}
