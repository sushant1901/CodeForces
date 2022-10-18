import java.util.*;

public class Solution41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int best,worst,count=0;
        best=sc.nextInt();
        worst=best;
        while(--n>0){
            int a=sc.nextInt();
            if(a<worst){
                worst=a;
                count++;
            }
            if(a>best){
                best=a;
                count++;
            }
        }
        System.out.println(count);

    }
}
