import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int easy=0;
        int hard=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a==1) {
                hard++;
            }

        }
        if(hard>=1)
            System.out.println("hard");
        else System.out.println("easy");




    }
}
