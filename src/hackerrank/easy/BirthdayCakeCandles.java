package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/7/18.
 */
public class BirthdayCakeCandles {
    private static final Scanner scan = new Scanner(System.in);

    static int birthdayCakeCandles(int n, int[] ar) {
        int result = 1;
        int maxValue = ar[0];

        for (int i = 1; i < n; i++) {
            if (maxValue < ar[i]) {
                maxValue = ar[i];
                result = 1;
            } else if (maxValue == ar[i]) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);

    }
}
