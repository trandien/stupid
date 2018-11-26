package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/20/18.
 */
public class SeparateTheNumbers {
    static void separateNumbers(String s) {
        int s_length = s.length();
        StringBuilder expected = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        boolean accept = false;
        for (int i = 0; i < s_length / 2; i++) {
            expected.append(s.charAt(i));
            int k = 0;
            while (tmp.toString().length() < s_length) {
                tmp.append(String.valueOf(Long.valueOf(expected.toString()) + k++));
            }
            if (tmp.toString().equals(s)) {
                accept = true;
                break;
            }
            tmp.setLength(0);
        }
        if (accept) {
            System.out.println("YES " + expected.toString());
        } else {
            System.out.println("NO");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            separateNumbers(s);
        }
        scanner.close();
    }
}
