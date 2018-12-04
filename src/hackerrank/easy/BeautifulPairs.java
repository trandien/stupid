package hackerrank.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class BeautifulPairs {
    static int beautifulPairs(int[] A, int[] B, int n) {
        int result = 0;
        int arr[] = new int[1001];
        for (int k : A) {
            arr[k]++;
        }
        for (int v : B) {
            if (arr[v] > 0) {
                result++;
                arr[v]--;
            }
        }
        if (result < n) {
            result++;
        } else {
            result --;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int[] A = new int[n];
        String[] AItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int AItem = Integer.parseInt(AItems[i]);
            A[i] = AItem;
        }
        int[] B = new int[n];
        String[] BItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }
        int result = beautifulPairs(A, B, n);
        System.out.println(result);
        scanner.close();
    }
}
