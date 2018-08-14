package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/26/18.
 */
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        boolean tmpArr[] = new boolean[101];
        for(int i=0; i<n; i++) {
            if(tmpArr[ar[i]]) {
                result++;
                tmpArr[ar[i]] = false;
            } else {
                tmpArr[ar[i]] = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
