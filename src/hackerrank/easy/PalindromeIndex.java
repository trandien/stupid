package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/27/18.
 */
public class PalindromeIndex {

    static int palindromeIndex(String s) {
        int s_length = s.length();
        int mid = s_length / 2;
        int result = -1;
        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) != s.charAt(s_length - i - 1)) {
                if ((s_length - i - 3 > 0) && s.charAt(i) == s.charAt(s_length - i - 2)
                        && s.charAt(i + 1) == s.charAt(s_length - i - 3)) {
                    result = s_length - i - 1;
                } else {
                    result = i;
                }
                break;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
