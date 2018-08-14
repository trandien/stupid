package study.dymamic_array.sorts;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dientt on 8/16/17.
 */
public class Chores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();

        int []complex = new int[n];
        for(int i=0; i<n; i++) {
            complex[i] = in.nextInt();
        }

        Arrays.sort(complex);
        int result = complex[v] - complex[v-1];
        System.out.println(result);
    }
}
