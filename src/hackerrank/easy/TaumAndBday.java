package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 8/2/18.
 */
public class TaumAndBday {
    // Complete the taumBday function below.
    static long taumBday(int b, int w, int bc, int wc, int z) {
        if (wc + z >= bc && wc <= bc + z) {
            return (long) b * bc + (long) w * wc;
        } else if (wc <= bc + z) {
            return (long) b * (wc + z) + (long) w * wc;
        } else {
            return (long) b * bc + (long) w * (bc + z);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine());
        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");
            int b = Integer.parseInt(bw[0]);
            int w = Integer.parseInt(bw[1]);
            String[] bcWcz = scanner.nextLine().split(" ");
            int bc = Integer.parseInt(bcWcz[0]);
            int wc = Integer.parseInt(bcWcz[1]);
            int z = Integer.parseInt(bcWcz[2]);
            long result = taumBday(b, w, bc, wc, z);
            System.out.println(result);
        }
        scanner.close();
    }
}
