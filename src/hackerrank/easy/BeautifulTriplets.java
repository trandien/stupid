package hackerrank.easy;

import java.util.*;

/**
 * Created by dientt on 8/2/18.
 */
public class BeautifulTriplets {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        List<Integer> integers = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            if (integers.contains(arrItem - d) && integers.contains(arrItem - 2 * d)) {
                result++;
            }
            integers.add(arrItem);
        }
        System.out.println(result);
        scanner.close();
    }
}
