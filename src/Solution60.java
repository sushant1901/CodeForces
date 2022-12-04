import java.util.*;
public class Solution60{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n=s.nextInt(), k=s.nextInt(), l=s.nextInt(), c=s.nextInt(), d=s.nextInt(), p=s.nextInt(), nl=s.nextInt(), np=s.nextInt();
        System.out.println(Math.min(c*d, Math.min(l*k/nl, p/np))/n);
    }
}
