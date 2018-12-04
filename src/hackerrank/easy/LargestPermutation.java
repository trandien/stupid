package hackerrank.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
// ???
public class LargestPermutation {
    static Integer[] largestPermutation(int k, Integer[] arr, Integer[] arrIndex) {
        int arr_length = arr.length;
        Integer[] arrSort = Arrays.copyOf(arr, arr_length);
        Arrays.sort(arrSort, Collections.reverseOrder());
        if (k >= arr_length) {
            return arrSort;
        }
        for (int i = 0; i < k; i++) {
            int tmp = arr[i];
            arr[arrIndex[arrSort[i]]] = arr[i];
            arr[i] = arrSort[i];
        }
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        Integer[] arr = new Integer[n];
        Integer[] arrIndex = new Integer[n + 1];
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            arrIndex[arrItem] = i;
        }
        Integer[] result = largestPermutation(k, arr, arrIndex);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
