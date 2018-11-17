package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/15/18.
 */
public class HappyLadybugs {

    static String happyLadybugs(String b) {
        int[] tmp = new int[26];
        boolean hasEmpty = false;
        boolean defaultHappy = true;
        if (b.length() == 1 && b.charAt(0) != '_') {
            return "NO";
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '_') {
                hasEmpty = true;
            } else {
                if (i == 0 && b.charAt(i) != b.charAt(i + 1)) {
                    defaultHappy = false;
                } else if (i > 0 && i < b.length() - 1) {
                    if (b.charAt(i) != b.charAt(i - 1) && b.charAt(i) != b.charAt(i + 1)) {
                        defaultHappy = false;
                    }
                } else if(i== b.length() - 1 && b.charAt(i) != b.charAt(i - 1)) {
                    defaultHappy = false;
                }
                tmp[(int) b.charAt(i) - 65]++;
            }
        }
        if (defaultHappy) {
            return "YES";
        }
        if (!hasEmpty) {
            return "NO";
        }
        for (int i = 0; i < 26; i++) {
            if (tmp[i] == 1) {
                return "NO";
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int g = Integer.parseInt(scanner.nextLine());
        for (int gItr = 0; gItr < g; gItr++) {
            int n = Integer.parseInt(scanner.nextLine());
            String b = scanner.nextLine();
            String result = happyLadybugs(b);
            System.out.println(result);
        }
        scanner.close();
    }
}
