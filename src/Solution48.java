
import java.util.*;
public class Solution48 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int[] in = new int[3];
        for (int i=0;i<3;i++) in[i]=s.nextInt();
        Arrays.sort(in);
        System.out.println(in[2]-in[0]);
    }
}