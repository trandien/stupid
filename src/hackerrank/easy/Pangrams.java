package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/20/18.
 */
public class Pangrams {

    static String pangrams(String s) {
        int l = 0;
        int arr[] = new int[26];
        int index = 0;
        int s_length = s.length();
        for (int i = 0; i < s_length; i++) {
            if (s.charAt(i) < 65 || s.charAt(i) > 122 || (s.charAt(i) < 97 && s.charAt(i) > 90)) continue;
            index = (s.charAt(i) > 90) ? s.charAt(i) - 97 : s.charAt(i) - 65;
            if (arr[index] == 0) {
                arr[index]++;
                l++;
            }
            if (l == 26) {
                return "pangram";
            }
        }
        return "not pangram";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        String result = pangrams(s);
        System.out.println(result);
        scanner.close();
    }
}
