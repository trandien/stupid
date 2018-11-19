package hackerrank.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by dientt on 11/17/18.
 */
public class BigSorting {

    static String[] bigSorting(String[] unsorted) {
        Arrays.parallelSort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    if(a.equals(b)) {
                        return 0;
                    }
                    return a.compareTo(b);
                }
                return a.length() - b.length();
            }
        });
        return unsorted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        scanner.close();
    }
}
