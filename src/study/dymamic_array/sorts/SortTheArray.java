package study.dymamic_array.sorts;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 8/16/17.
 */
public class SortTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int []a = new int[n];
        int []s = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
            s[i] = in.nextInt();
        }
        Arrays.sort(s);
        int l = 0;
        int r = n-1;
        for(int i=0; i<r-l; i++) {
            if(s[i] != a[i]) {
                l = i;
            }
        }

    }
}
