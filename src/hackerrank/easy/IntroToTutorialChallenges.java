package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/19/18.
 */
public class IntroToTutorialChallenges {
    static int introTutorial(int v, int[] arr, int n) {
        return find(v, arr, 0, n - 1);
    }

    static int find(int v, int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (v == arr[mid]) {
            return mid;
        }
        if (v > arr[mid]) {
            left = mid + 1;
        } else if (v < arr[mid]) {
            right = mid - 1;
        }
        return find(v, arr, left, right);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int V = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int result = introTutorial(V, arr, n);
        System.out.println(result);
        scanner.close();
    }
}
