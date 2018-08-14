package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/10/18.
 */
@Deprecated
public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;
        int tmpArr[] = new int[k];
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp = ar[i] % k;
            result += tmpArr[(k-tmp)%k];
            tmpArr[tmp]++;
        }
        return result;
    }

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
