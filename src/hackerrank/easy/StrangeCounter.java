package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 11/17/18.
 */
public class StrangeCounter {
    static long strangeCounter(long t) {
        long tmp = 0;
        long index = 3;
        while (t > tmp) {
            tmp += index;
            index = index * 2;
        }
        return tmp + 1 - t;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long t = Long.parseLong(scanner.nextLine());
        long result = strangeCounter(t);
        System.out.println(result);
        scanner.close();
    }
}
