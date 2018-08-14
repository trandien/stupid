package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/26/18.
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {
        int result = 0;
        int step = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                step++;
                if (step == 0) {
                    result++;
                }
            } else {
                step--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
