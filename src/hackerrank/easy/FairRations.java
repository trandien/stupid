package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/14/18.
 */
public class FairRations {
    static int fairRations(int[] B) {
        int result = 0;
        for (int i = 0; i < B.length - 1; i++) {
            if (B[i] % 2 != 0) {
                result += 2;
                B[i + 1]++;
            }
        }
        if (B[B.length - 1] % 2 != 0) {
            result++;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = Integer.parseInt(scanner.nextLine());
        int[] B = new int[N];
        String[] BItems = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }
        int result = fairRations(B);
        System.out.println((result % 2 == 0) ? result : "NO");
        scanner.close();
    }
}
