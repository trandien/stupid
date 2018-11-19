package hackerrank.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by dientt on 11/19/18.
 */
public class Quicksort1Partition {
    static void quickSort(int[] arr) {
        int pivot = arr[0];
        LinkedList<Integer> arrRight = new LinkedList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) {
                System.out.print(arr[i] + " ");
            } else {
                arrRight.add(arr[i]);
            }
        }
        System.out.print(pivot + " ");
        for (int a : arrRight) {
            System.out.print(a + " ");
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
        quickSort(arr);
        scanner.close();
    }
}
