package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/20/18.
 */
public class HackerRankInAString {

    static String hackerrankInString(String s) {
        int index = 0;
        String expected = "hackerrank";
        int l = expected.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == expected.charAt(index)) {
                index++;
            }
            if(index == l) {
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
