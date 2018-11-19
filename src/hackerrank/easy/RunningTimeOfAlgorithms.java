package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/19/18.
 */
public class RunningTimeOfAlgorithms {
    static void insertionSort2(int n, int[] arr) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int k = arr[i];
            while (j >= 0 && k < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            result += (i - 1) - j;
            arr[j + 1] = k;
        }
        System.out.println(result);
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
