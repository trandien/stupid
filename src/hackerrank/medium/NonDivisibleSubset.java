package hackerrank.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 5/26/18.
 */
public class NonDivisibleSubset {
    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, int[] S) {
        if (k == 1) {
            return 1;
        }
        int result = 0;
        int arr[] = new int[k];
        for (int i = 0; i < S.length; i++) {
            arr[S[i] % k]++;
        }
        if (arr[0] == S.length) {
            return 1;
        } else {
            result = Math.min(arr[0], 1);
        }
        if (k == 2) {
            result += Math.min(arr[1], 1);
        } else {
            for (int i = 1; i < k / 2; i++) {
                result += Math.max(arr[i], arr[k - i]);
            }
            if (k % 2 == 0) {
                result += 1;
            } else {
                result += Math.max(arr[k / 2], arr[k / 2 + 1]);
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] S = new int[n];
        String[] SItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int SItem = Integer.parseInt(SItems[i]);
            S[i] = SItem;
        }

        int result = nonDivisibleSubset(k, S);
        System.out.println(result);
        scanner.close();
    }
}
