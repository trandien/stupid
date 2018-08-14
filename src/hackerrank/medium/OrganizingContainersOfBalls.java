package hackerrank.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 5/30/18.
 */
public class OrganizingContainersOfBalls {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            int n = Integer.parseInt(scanner.nextLine());
            int[] balls = new int[n];
            int [] box = new int[n];
            int[][] container = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                    balls[j] += containerItem;
                    box[i] += containerItem;
                }
            }
            Arrays.sort(balls);
            Arrays.sort(box);
            if(Arrays.equals(balls, box)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
        scanner.close();
    }
}
