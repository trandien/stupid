package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 8/14/18.
 */
public class LisaWorkbook {
    static int workbook(int n, int k, int[] arr) {
        int result = 0;
        int currentPage = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= arr[i]; j += k) {
                if (currentPage >= j && currentPage <= Math.min(j + k - 1, arr[i])) {
                    result++;
                }
                currentPage++;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int result = workbook(n, k, arr);
        System.out.println(result);
        scanner.close();
    }
}
