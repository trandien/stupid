package hackerrank.medium;

import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class StringConstruction {
    static int stringConstruction(String s) {
        int result = 0;
        int s_length = s.length();
        boolean arr[] = new boolean[26];
        for(int i=0; i<s_length; i++) {
            if(!arr[s.charAt(i) - 97]) {
                result ++;
                arr[s.charAt(i) - 97] = true;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine());
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
