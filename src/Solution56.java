import java.util.*;
public class Solution56
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];
        for(int i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<3;i++)
        {
            int x=a[3]-a[i];
            System.out.print(x+" ");
        }
    }
}