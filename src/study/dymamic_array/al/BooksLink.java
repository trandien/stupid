package study.dymamic_array.al;

import java.util.Scanner;

/**
 * Created by dientt on 8/18/17.
 */
public class BooksLink {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int result = 0;
        int x = 0;
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for(int j=0; j<n; j++) {
            x += arr[j];
            if(x>t) {
                // some code
                break;
            }
            else if(x==t) {
                // some code
                break;
            }
            else {

            }

        }

    }
}
