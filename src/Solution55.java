import java.sql.SQLOutput;
import java.util.*;
public class Solution55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int i,j,n,d;
        while(t-->0){
            n=sc.nextInt();
            int [] arr1= new int[n];
            int []  arr2= new int[n];
            for(i=0;i<n;i++){
                arr1[i]=sc.nextInt();
                arr2[i]=arr1[i];
            }
            Arrays.sort(arr2);

            d=arr2[n-1];
            j=arr2[n-2];

            for(i=0;i<n;i++){
                if(arr1[i]==d) System.out.print(d-j+" ");
                else System.out.print(arr1[i]-d+" ");
            }
            System.out.println();
        }

    }
}
