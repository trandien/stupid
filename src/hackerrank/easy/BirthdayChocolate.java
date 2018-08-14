package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/9/18.
 */

@Deprecated
public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {
        int result = 0;
        int total = 0;
        for(int i=0; i<m; i++) {
            total += s[i];
        }
        if(total == d) result++;
        for(int i=0; i<n-m; i++) {
            total = total - s[i] + s[i+m];
            if(total == d) result++;
        }
        return result;
    }

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
