import java.util.*;
public class Solution47
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        while((a*i)%10!=b && (a*i)%10!=0){
            i=i+1;
        }
        System.out.println(i);

    }
}
