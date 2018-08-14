package hackerrank.medium;

import java.util.Scanner;

/**
 * Created by dientt on 5/27/18.
 */
public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long result = 0;
        if ("a".equals(s)) {
            return n;
        }
        int lenght = s.length();
        long numberOfRepeat = n / lenght;
        int numberOfA = 0;
        long mod = n % lenght;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numberOfA++;
            }
            if(i < mod && s.charAt(i % lenght) == 'a') {
                result ++;
            }
        }
        result += numberOfA * numberOfRepeat;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
