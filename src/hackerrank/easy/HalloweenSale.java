package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 8/13/18.
 */
public class HalloweenSale {
    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        if (s < p) return 0;
        int number_of_first = Math.min((p - m) / d, (s - p) / d);
        if (number_of_first < 0) number_of_first = 1;
        int spent = p + p * number_of_first - d * number_of_first * (number_of_first + 1) / 2;
        int number_of_second = (s - spent) / m;
        if (number_of_second <= 0) return number_of_first + 1;
        int result = number_of_first + number_of_second + 1;
        return result < 0 ? 1 : result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] pdms = scanner.nextLine().split(" ");
        int p = Integer.parseInt(pdms[0]);
        int d = Integer.parseInt(pdms[1]);
        int m = Integer.parseInt(pdms[2]);
        int s = Integer.parseInt(pdms[3]);
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        scanner.close();
    }
}
