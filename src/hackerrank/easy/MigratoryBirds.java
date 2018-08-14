package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/10/18.
 */
public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[5];
        int result = 0;
        int max = Integer.MIN_VALUE;
        int input = 0;
        for(int ar_i = 0; ar_i < n; ar_i++) {
            input = in.nextInt();
            ar[--input]++;
            if(max < ar[input]) {
                max = ar[input];
                result = input;
            } else if(max == ar[input]) {
                if(result > input) {
                    result = input;
                }
            }
        }

        System.out.println(++result);
    }
}
