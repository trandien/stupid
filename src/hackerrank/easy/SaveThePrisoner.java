package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/22/18.
 */
public class SaveThePrisoner {

    private static int saveThePrisoner(int n, int m, int s) {
        int result = ((m % n) + s - 1) % n;
        return (result == 0) ? n : result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine());
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nms[0]);
            int m = Integer.parseInt(nms[1]);
            int s = Integer.parseInt(nms[2]);
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
        scanner.close();
    }
}
