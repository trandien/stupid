package study.dymamic_array;

import java.util.Scanner;

/**
 * Created by dientt on 8/9/17.
 */
public class FashionInBerland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = 0;
        for(int i=0; i<n; i++) {
            int input = in.nextInt();
            if(input == 0) temp++;
        }
        if((temp == 1 && n>1) || (n==1 && temp ==0)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
