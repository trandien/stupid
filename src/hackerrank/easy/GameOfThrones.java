package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class GameOfThrones {

    static void gameOfThrones(String s) {
        int numberOfOdd = 0;
        boolean odd = s.length() % 2 != 0;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0) {
                numberOfOdd++;
                if (odd && numberOfOdd > 1) {
                    break;
                }
            }
        }
        if (odd) {
            if (numberOfOdd == 0 || numberOfOdd > 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            if (numberOfOdd == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        gameOfThrones(s);
        scanner.close();
    }
}
