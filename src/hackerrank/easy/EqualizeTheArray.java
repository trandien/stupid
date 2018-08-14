package hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 8/1/18.
 */
public class EqualizeTheArray {
    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr, int length) {
        Arrays.sort(arr);
        return length - arr[100];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[101];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[arrItem]++;
        }
        int result = equalizeArray(arr, n);
        System.out.println(result);
        scanner.close();
    }
}
