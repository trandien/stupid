package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class SherlockAndArray {
    static String solve(int total, int[] a) {
        int left = 0;
        int a_length = a.length;
        boolean result = false;
        for (int i = 0; i < a_length; i++) {
            if (left == total - a[i] - left) {
                result = true;
                break;
            }
            left += a[i];
        }
        return result ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        for (int a0 = 0; a0 < T; a0++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int total = 0;
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
                total += a[a_i];
            }
            String result = solve(total, a);
            System.out.println(result);
        }
    }
}
