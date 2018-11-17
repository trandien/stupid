package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/14/18.
 */
public class ManasaAndStones {

    static void stones(int n, int a, int b) {
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        if (max == min) {
            System.out.println(a*(n-1));
        } else {
            int rangeMax = (n - 1) * max;
            int rangeMin = (n - 1) * min;
            int sub = max - min;
            while (rangeMin <= rangeMax) {
                System.out.print(rangeMin + " ");
                rangeMin += sub;
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = Integer.parseInt(scanner.nextLine());
        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(scanner.nextLine());
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            stones(n, a, b);
        }
        scanner.close();
    }
}
