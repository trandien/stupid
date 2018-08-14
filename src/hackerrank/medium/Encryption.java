package hackerrank.medium;

import java.util.Scanner;

/**
 * Created by dientt on 5/30/18.
 */
public class Encryption {
    // Complete the encryption function below.
    static void encryption(String s) {
        int length = s.length();
        int columns = (int) Math.ceil(Math.sqrt(length));
        for (int i = 0; i < columns; i++) {
            for (int j = i; j < length; j += columns) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        encryption(s);
        scanner.close();
    }
}
