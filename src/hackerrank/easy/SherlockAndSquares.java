package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 8/1/18.
 */
public class SherlockAndSquares {
    private static final Scanner scanner = new Scanner(System.in);

    public static int squares(int a, int b) {
        return (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
    }

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int result = squares(a, b);
            System.out.println(result);
        }
        scanner.close();
    }
}
