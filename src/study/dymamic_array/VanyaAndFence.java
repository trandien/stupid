package study.dymamic_array;

import java.util.Scanner;

/**
 * Created by dientt on 8/9/17.
 */
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height = in.nextInt();
        int result = 0;
        for(int i=0; i<n; i++) {
            int l = in.nextInt();
            if(l<=height) {
                result += 1;
            } else {
                result += 2;
            }
        }
        System.out.println(result);
    }
}
