import java.util.*;
public class Solution30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int r=0,m=0;
        for(int i=0; i<n; i++){
            int a=sc.nextInt();
            if(a<=min){
                min=a;
                r=i;
            }
            if(a>max){
                max=a;
                m=i;
            }}
        int res=((m+((n-1)-r))-(r<m?1:0));
        System.out.println(res);
    }}