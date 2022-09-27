import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution29{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        Map<Integer, Integer> levels = new HashMap<>();
        for (int i = 0; i < p; i++)
            levels.put(in.nextInt(), 0);
        int q = in.nextInt();
        for (int i = 0; i < q; i++)
            levels.put(in.nextInt(), 0);
        if (levels.size() == n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
        in.close();
    }

}