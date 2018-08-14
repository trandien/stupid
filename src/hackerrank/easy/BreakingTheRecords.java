package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/9/18.
 */
public class BreakingTheRecords {
    /*
     * Complete the breakingRecords function below.
     */
    static void breakingRecords(int[] scores) {
        int numberOfIncrease = 0;
        int numberOfDescrease = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if(max < scores[i]) {
                max = scores[i];
                numberOfIncrease ++;
            }
            if(min > scores[i]) {
                min = scores[i];
                numberOfDescrease ++;
            }
        }
        System.out.println(numberOfIncrease + " " + numberOfDescrease);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        breakingRecords(score);

    }
}
