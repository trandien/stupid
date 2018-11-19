package hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by dientt on 11/19/18.
 */
public class InsertionSortPart2 {
    static void insertionSort2(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int k = arr[i];
            while (j >= 0 && k < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
            for (int m = 0; m < n; m++) {
                System.out.print(arr[m] + " ");
            }
            System.out.println();
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
        insertionSort2(n, arr);
        scanner.close();
    }
}
