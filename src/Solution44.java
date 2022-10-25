import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int input, sum = 0, neg = 0;
        for (int i = 0; i < testCases; i++) {
            input = scan.nextInt();
            if (input > 0) {
                sum+=input;
            } else if (input < 0) {
                if (sum > 0) {
                    sum--;
                } else {
                    neg++;
                }
            }
        }
        System.out.println(neg);
    }
}