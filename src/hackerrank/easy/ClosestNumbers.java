package hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 11/26/18.
 */
public class ClosestNumbers {
    static void closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        StringBuilder pairs = new StringBuilder();
        pairs.append(arr[0] + " " + arr[1] + " ");
        int diff = 0;
        for (int i = 2; i < arr.length; i++) {
            diff = arr[i] - arr[i - 1];
            if (diff < min) {
                min = diff;
                pairs.setLength(0);
                pairs.append(arr[i - 1] + " " + arr[i] + " ");
            } else if (min == diff) {
                pairs.append(arr[i - 1] + " " + arr[i] + " ");
            }
        }
        System.out.println(pairs.toString());

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
        closestNumbers(arr);
        scanner.close();
    }
}
