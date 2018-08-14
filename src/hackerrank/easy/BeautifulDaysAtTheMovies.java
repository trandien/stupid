package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/22/18.
 */
public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        int result = 0;
        for (int a = i; a <= j; a++) {
            int tmp = a;
            int reverse = 0;
            int mod = 0;
            while (tmp > 0) {
                mod = tmp % 10;
                reverse = reverse * 10 + mod;
                tmp = tmp / 10;
            }
            if (Math.abs(reverse - a) % k == 0) {
                result++;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ijk = scanner.nextLine().split(" ");
        int i = Integer.parseInt(ijk[0]);
        int j = Integer.parseInt(ijk[1]);
        int k = Integer.parseInt(ijk[2]);
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        scanner.close();
    }
}
