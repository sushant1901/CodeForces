import java.util.*;

public class Solution53 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int [] arr= new int[3];
            for(int i=0; i<3; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<3; i++){
                Arrays.sort(arr);

            }
            System.out.println(arr[1]);


        }
    }
}
