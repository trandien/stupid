package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dientt on 5/20/18.
 */
public class ClimbingTheLeaderboard {
    // Complete the climbingLeaderboard function below.
    static void climbingLeaderboard(List<Integer> scores, int[] alice) {
        int left = 0;
        int right = 0;
        int mid = 0;
        int lengthOfScores = scores.size() - 1;
        for (int i = 0; i < alice.length; i++) {
            if (alice[i] >= scores.get(0)) {
                System.out.println(1);
                continue;
            } else if (alice[i] < scores.get(lengthOfScores)) {
                System.out.println(lengthOfScores + 2);
                continue;
            } else if (alice[i] == scores.get(lengthOfScores)) {
                System.out.println(lengthOfScores + 1);
                continue;
            }
            left = 0;
            right = scores.size();
            mid = (left + right) / 2;

            while (left < right) {
                if (alice[i] < scores.get(mid)) {
                    left = mid + 1;
                } else if (alice[i] > scores.get(mid)) {
                    right = mid - 1;
                } else {
                    System.out.println(mid + 1);
                    break;
                }
                mid = (left + right) / 2;
                if (left >= right) {
                    if (alice[i] < scores.get(mid)) {
                        System.out.println(right + 2);
                    } else {
                        System.out.println(right + 1);
                    }
                    break;
                }
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int scoresCount = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> scores = new ArrayList<>();
        String[] scoresItems = scanner.nextLine().split(" ");
        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            if (i == 0 || (i > 0 && scores.get(scores.size() - 1) != scoresItem)) {
                scores.add(scoresItem);
            }
        }
        int aliceCount = Integer.parseInt(scanner.nextLine().trim());
        int[] alice = new int[aliceCount];
        String[] aliceItems = scanner.nextLine().split(" ");
        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        climbingLeaderboard(scores, alice);

        scanner.close();
    }
}
