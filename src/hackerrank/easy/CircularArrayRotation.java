package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 7/31/18.
 */
public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] result = new int[queries.length];
        int a_length = a.length;
        int index = 0;
        for (int i = 0; i < queries.length; i++) {
            index = queries[i] - k%a_length;
            index = index<0? index + a_length : index;
            result[i] = a[index];
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nkq = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nkq[0]);
        int k = Integer.parseInt(nkq[1]);
        int q = Integer.parseInt(nkq[2]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            queries[i] = queriesItem;
        }
        int[] result = circularArrayRotation(a, k, queries);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        scanner.close();
    }
}
