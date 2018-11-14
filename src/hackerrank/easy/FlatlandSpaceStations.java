package hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 11/14/18.
 */
public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        int result = 0;
        Arrays.sort(c);
        for (int i = 1; i < c.length; i++) {
            result = Math.max(result, (c[i] - c[i - 1]) / 2);
        }

        if (c[0] != 0) {
            result = Math.max(result, c[0]);
        }
        if (c[c.length - 1] != (n - 1)) {
            result = Math.max(result, (n - 1 - c[c.length - 1]));
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] c = new int[m];
        String[] cItems = scanner.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        scanner.close();
    }
}
