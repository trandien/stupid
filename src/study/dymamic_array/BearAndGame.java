package study.dymamic_array;

import java.util.Scanner;

/**
 * Created by dientt on 8/9/17.
 */
public class BearAndGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = 0;
        int min = 15;
        int result = 0;
        int[] test = new int[n+2];
        test[0] = 0;
        test[n+1] = 90;
        for(int i=0; i<n; i++) {
            int input = in.nextInt();
            test[i+1] = input;

        }
        for(int j = 1; j<test.length; j++) {
            if(test[j] - test[j-1] <=15) {
                result = test[j];
            } else {
                result = test[j-1] + 15;
                break;
            }

        }

        System.out.println(result);
    }
}
