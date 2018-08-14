package hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 4/26/18.
 */
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int bucket) {
        int bestPrice = 0;
        int tmp = 0;
        int smaller[] = keyboards.length > drives.length ? drives : keyboards;
        int lager[] = keyboards.length < drives.length ? drives : keyboards;
        Arrays.sort(lager);
        int length = lager.length;
        int left = 0;
        int right = length;
        int mid = length / 2;
        for (int i = 0; i < smaller.length; i++) {
            while (mid >= 0 && mid < length) {
                tmp = smaller[i] + lager[mid];
                if (tmp == bucket) return tmp;
                if (bestPrice < tmp && tmp <= bucket) {
                    bestPrice = tmp;
                }
                if (tmp < bucket) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
                if((left > right)) {
                    break;
                }
                mid = (left + right) / 2;
            }
            left = 0;
            right = length;
            mid = length / 2;
        }

        return bestPrice == 0 ? -1 : bestPrice;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] bnm = scanner.nextLine().split(" ");
        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(moneySpent);

        scanner.close();
    }
}
