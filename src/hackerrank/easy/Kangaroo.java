package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/8/18.
 */
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v2 >= v1) {
            return "NO";
        }
        int result = ((x2 - x1) % (v1 - v2));
        if (result == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
