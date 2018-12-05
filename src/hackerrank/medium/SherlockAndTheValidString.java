package hackerrank.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class SherlockAndTheValidString {
    static String isValid(String s) {
        int arr[] = new int[26];
        int s_length = s.length();
        for (int i = 0; i < s_length; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int score = -1;
        boolean flag = false;
        boolean result = true;
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                if (score == -1) {
                    score = arr[i];
                } else {
                    if (score == arr[i]) {
                        continue;
                    } else if (arr[i] == 1 && !flag) {
                        flag = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        String result = isValid(s);
        System.out.println(result);
        scanner.close();
    }
}
