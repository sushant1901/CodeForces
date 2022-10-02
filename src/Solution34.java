 import java.util.Scanner;
 public class Solution34
{
    public static void main(String[] args)
    {
        Scanner zz=new Scanner(System.in);
        String x=zz.nextLine();
        String y=x.replace("{", "").replace("}", "").replaceFirst(",", "").replaceAll("\\s","");
        int k=0;
        for(char ch='a';ch<='z';ch++)
        {
            if(y.contains(String.valueOf(ch)))
                k++;
        }
        System.out.println(k);
    }
}

