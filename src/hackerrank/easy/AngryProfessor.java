package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/22/18.
 */
public class AngryProfessor {

    private static final Scanner scanner = new Scanner(System.in);

    static String angryProfessor(int[] arr, int k) {
        int onTime = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                onTime++;
            }
        }
        return onTime >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine());
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(a, k);
            System.out.println(result);
        }

        scanner.close();
    }
}
