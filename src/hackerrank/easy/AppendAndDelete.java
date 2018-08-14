package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 7/31/18.
 */
public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        if (s.equals(t)) return "Yes";
        int t_length = t.length();
        int s_length = s.length();
        int small_length = s_length < t_length ? s_length : t_length;
        int diff = small_length;
        for (int i = 0; i < small_length; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                diff = i;
                break;
            }
        }
        if ((t_length + s_length - 2 * diff) > k) {
            return "No";
        }
        else if ((t_length + s_length - 2 * diff) % 2 == k % 2) {
            return "Yes";
        }
        else if (t_length + s_length < k ) {
            return "Yes";
        }
        return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        scanner.close();
    }
}
