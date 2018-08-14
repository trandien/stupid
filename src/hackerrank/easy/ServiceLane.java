package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 8/14/18.
 */
public class ServiceLane {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nt = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nt[0]);
        int t = Integer.parseInt(nt[1]);
        int[] width = new int[n];
        String[] widthItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }
        for (int i = 0; i < t; i++) {
            int min = 3;
            String[] casesRowItems = scanner.nextLine().split(" ");
            int start = Integer.parseInt(casesRowItems[0]);
            int end = Integer.parseInt(casesRowItems[1]);
            for (int k = start; k <= end; k++) {
                if (width[k] == 1) {
                    min = 1;
                    break;
                }
                min = Math.min(min, width[k]);
            }
            System.out.println(min);

        }
        scanner.close();
    }
}
