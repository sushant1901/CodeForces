import java.util.Scanner;
public class Solution28{

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        int feeling = myscanner.nextInt();

        for(int i=1; i<=feeling; i++)
        {
            if(i%2 ==0)
            {
                System.out.print("I love ");
            }
            else
            {
                System.out.print("I hate ");
            }

            if(i == feeling)
            {
                System.out.print("it");
            }
            else
            {
                System.out.print("that ");
            }
        }
    }
}
