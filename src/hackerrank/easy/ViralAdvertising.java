package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/22/18.
 */
public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int result = 2;
        int like = 2;
        for (int i = 1; i < n; i++) {
            like = like * 3 / 2;
            result += like;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        scanner.close();
    }
}
