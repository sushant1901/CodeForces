import java.io.*;
import java.util.*;

public class Solution24 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(f.readLine());
        int groups = 1;
        String[] magnets = new String[n];
        for (int i = 0; i < n; i++) {
            magnets[i] = f.readLine();
            if (i > 0 && magnets[i].charAt(0) == magnets[i-1].charAt(1))
                groups++;
        }
        System.out.println(groups);
    }
}