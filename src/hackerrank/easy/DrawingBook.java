package hackerrank.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dientt on 4/26/18.
 */
public class DrawingBook {

    static int pageCount(int n, int p) {
        return Math.min(p/2, (n/2 - p/2));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

        int p = scanner.nextInt();

        int result = pageCount(n, p);
        System.out.println(result);

        scanner.close();
    }
}
