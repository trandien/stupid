package hackerrank.medium;

import java.util.*;

/**
 * Created by dientt on 5/27/18.
 */
public class JumpingOnTheClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int result = 0;
        int length = c.length;
        for (int i = 0; i < length - 1; i++, result++) {
            if ((i + 2) < length && c[i + 2] == 0) i++;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int[] c = new int[n];
        String[] cItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        scanner.close();
    }


}
