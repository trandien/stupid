package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/20/18.
 */
public class PickingNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    static int pickingNumbers(int n, int tmp[]) {
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (tmp[i] + tmp[i + 1] > result) result = tmp[i] + tmp[i + 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] a = new int[n];
        int tmp[] = new int[100];
        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
            tmp[aItem]++;
        }
        int result = pickingNumbers(n, tmp);
        System.out.println(result);
        scanner.close();
    }
}
