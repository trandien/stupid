package hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 8/1/18.
 */
public class CutTheSticks {
    // Complete the cutTheSticks function below.
    static void cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        int tmp = 0;
        int arr_length = arr.length;
        System.out.println(arr_length);
        for (int i = 0; i < arr_length - 1; i++) {
            tmp++;
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr_length - tmp);
            }
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
        cutTheSticks(arr);
        scanner.close();
    }
}
