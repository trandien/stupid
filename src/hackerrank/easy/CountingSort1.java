package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/19/18.
 */
public class CountingSort1 {

    static void countingSort(int[] arr) {
        int[] result = new int[100];
        int max = 0;

        for (int e : arr) {
            if (e > max) {
                max = e;
            }
            result[e]++;
        }

        for (int i = 0; i <= max; i++) {
            System.out.print(result[i] + " ");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        countingSort(arr);
        scanner.close();
    }
}
