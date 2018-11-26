package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/20/18.
 */
public class StrongPassword {
    static int minimumNumber(int n, String password) {
        int numbers = 0;
        int lower_case = 0;
        int upper_case = 0;
        int special_characters = 0;

        for (int i = 0; i < n; i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' && upper_case == 0) {
                upper_case++;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z' && lower_case == 0) {
                lower_case++;
            } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9' && numbers == 0) {
                numbers++;
            } else if ((password.charAt(i) == '!' || password.charAt(i) == '@'
                    || password.charAt(i) == '#' || password.charAt(i) == '$'
                    || password.charAt(i) == '%' || password.charAt(i) == '^'
                    || password.charAt(i) == '&' || password.charAt(i) == '*'
                    || password.charAt(i) == '(' || password.charAt(i) == ')'
                    || password.charAt(i) == '-' || password.charAt(i) == '+'
                )&& special_characters == 0) {
                special_characters++;
            }
            if (n > 5 && (upper_case + lower_case + numbers + special_characters == 4)) {
                return 0;
            }
        }
        int total_case = upper_case + lower_case + numbers + special_characters;
        if (n > 5 && (total_case == 4)) {
            return 0;
        }
        return Math.max(4 - total_case, 6 - n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        String password = scanner.nextLine();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        scanner.close();
    }
}
