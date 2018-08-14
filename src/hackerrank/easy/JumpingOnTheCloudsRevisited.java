package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 7/31/18.
 */
public class JumpingOnTheCloudsRevisited {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] c = new int[n];
        String[] cItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
        int result = 0;
        for (int i = 0; i < n; i += k) {
            if (c[i] == 0) {
                result += 1;
            } else {
                result += 3;
            }
        }
        if (n % k != 0) {
            result++;
        }
        System.out.println(100 - result);
        scanner.close();
    }
}
