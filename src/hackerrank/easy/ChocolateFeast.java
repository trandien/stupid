package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 8/14/18.
 */
public class ChocolateFeast {
    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int cost, int m) {
        int result = n / cost;
        int wrappers = result;
        while (wrappers >= m) {
            result += wrappers / m;
            wrappers = wrappers / m + wrappers % m;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine());
        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");
            int n = Integer.parseInt(ncm[0]);
            int c = Integer.parseInt(ncm[1]);
            int m = Integer.parseInt(ncm[2]);
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        scanner.close();
    }
}
