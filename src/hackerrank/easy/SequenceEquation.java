package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 7/31/18.
 */
public class SequenceEquation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int[] p = new int[n+1];

        String[] pItems = scanner.nextLine().split(" ");
        for (int i = 1; i <= n; i++) {
            p[Integer.parseInt(pItems[i-1])] = i;
        }
        for (int i=1; i<=n; i++) {
            System.out.println(p[p[i]]);
        }

        scanner.close();
    }
}
