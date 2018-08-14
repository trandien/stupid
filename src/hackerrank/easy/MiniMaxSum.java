package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/7/18.
 */
public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        int max = arr[0], min = arr[0];
        long result = max;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

            result += arr[i];
        }
        System.out.println((result - max) + " " + (result - min));


    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
