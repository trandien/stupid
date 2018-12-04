package hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class MinimumAbsoluteDifferenceInAnArray {
    static int minimumAbsoluteDifference(int[] arr) {
        int arr_length = arr.length - 1;
        Arrays.sort(arr);
        int result = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < arr_length; i++) {
            result = Math.min(result, Math.abs(arr[i] - arr[i + 1]));
        }
        return result;
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
        int result = minimumAbsoluteDifference(arr);
        System.out.println(result);
        scanner.close();
    }
}
