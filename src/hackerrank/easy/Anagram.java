package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class Anagram {
    static int anagram(String s) {
        int s_length = s.length();
        if (s_length % 2 != 0) return -1;
        int result = 0;
        int mid = s_length / 2;
        int arrA[] = new int[26];
        int arrB[] = new int[26];
        for (int i = 0; i < s_length; i++) {
            if (i < mid) {
                arrA[s.charAt(i) - 97]++;
            } else {
                arrB[s.charAt(i) - 97]++;
            }
        }
        for (int k = 0; k < 26; k++) {
            result += Math.abs(arrA[k] - arrB[k]);
        }
        return result / 2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
