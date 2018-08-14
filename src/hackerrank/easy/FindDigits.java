package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 7/31/18.
 */
public class FindDigits {

    static int findDigits(int n) {
        int result = 0;
        int value = n;
        while (value > 0) {
            int div = value % 10;
            if (div != 0 && n % div == 0) {
                result++;
            }
            value = value / 10;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine());
            int result = findDigits(n);
            System.out.println(result);
        }
        scanner.close();
    }
}
