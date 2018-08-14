package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/7/18.
 */
public class GradingStudents {
    static int[] gradingStudents(int[] grades) {
        int length = grades.length;
        int[] result = new int[length];
        int temp = 0;
        for (int i = 0; i < length; i++) {
            temp = grades[i] % 5;
            if (temp >= 3 && grades[i] >= 38) {
                result[i] = grades[i] + (5 - temp);
            } else {
                result[i] = grades[i];
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        for (int value : result) {
            System.out.println(value);
        }

    }
}
