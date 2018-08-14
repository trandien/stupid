package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/21/18.
 */
public class TheHurdleRace {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        int max = 0;
        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
            if(max < heightItem) {
                max = heightItem;
            }
        }

        if(max - k > 0) {
            System.out.println(max - k);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
