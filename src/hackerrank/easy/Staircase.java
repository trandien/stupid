package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/7/18.
 */
public class Staircase {
    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
