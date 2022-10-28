import java.util.*;

public class Solution46 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        int d=0;
        int e=0;
        String s;
        for(int i=0;i<a;i++) {
            int b=sc.nextInt();
            String b1=""+b;
            int h=b1.length();
            e=0;
            s="";
            for(int k=1;k<=h;k++) {
                c = (int)Math.pow(10,k);
                if(b%c!=0) {
                    d=b%c;
                    String g=d+" ";
                    s=g+s;
                    b=b-d;
                    e++;
                }



            }
            System.out.printf("%d\n%s\n",e, s);
        }
    }

}