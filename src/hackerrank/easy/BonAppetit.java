package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/13/18.
 */
public class BonAppetit {
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int k = in.nextInt();
        if (n <= k) return;
        int price = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            price = in.nextInt();
            if (i != k) {
                total += price;
            }
        }
        int charged = in.nextInt();
        int refund = charged - total/2;
        if(refund == 0) {
            System.out.println("Bon Appetit");
        } else if(refund > 0) {
            System.out.println(refund);
        }
    }
}
