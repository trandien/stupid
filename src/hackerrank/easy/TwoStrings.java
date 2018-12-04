package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        int arr[] = new int[26];
        String strLarge = (s1.length() > s2.length()) ? s2 : s1;
        String strSmall = (s1.length() <= s2.length()) ? s2 : s1;
        int small_length = strSmall.length();
        int large_length = strLarge.length();
        for (int i = 0; i < small_length; i++) {
            arr[strSmall.charAt(i) - 97]++;
        }
        boolean haveSub = false;
        for (int i = 0; i < large_length; i++) {
            if (arr[strLarge.charAt(i) - 97] > 0) {
                haveSub = true;
                break;
            }
        }
        return haveSub ? "YES" : "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        scanner.close();
    }
}
