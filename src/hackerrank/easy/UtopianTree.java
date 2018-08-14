package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/22/18.
 */
public class UtopianTree {
    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                result++;
            } else {
                result *= 2;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine());
        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine());
            int result = utopianTree(n);
            System.out.println(result);
        }

        scanner.close();
    }
}
