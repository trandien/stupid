package hackerrank.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dientt on 8/12/18.
 */
public class MinimumDistances {
    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        Map<Integer, Integer> distanceMap = new HashMap<>();
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (distanceMap.containsKey(a[i])) {
                result = Math.min(result, i - distanceMap.get(a[i]));
            }
            distanceMap.put(a[i], i);
        }
        return result != Integer.MAX_VALUE ? result : -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int result = minimumDistances(a);
        System.out.println(result);
        scanner.close();
    }
}
