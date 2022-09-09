import java.util.Scanner;

public class Solution8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        k = arr[k - 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k && arr[i] > 0)
                count++;
            else
                break;
        }
        System.out.println(count);
        sc.close();
    }
}
