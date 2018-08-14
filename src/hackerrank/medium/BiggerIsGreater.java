package hackerrank.medium;

import java.util.Scanner;

/**
 * Created by dientt on 5/31/18.
 */
public class BiggerIsGreater {

    static int[] permutation(int input[]) {
        int i = input.length - 1;
        // find pivot
        while (i > 0 && input[i] <= input[i - 1]) {
            i--;
        }
        if (i <= 0) {
            return input;
        }

        // find right
        int j = input.length - 1;
        while (j > i && input[j] <= input[i - 1]) {
            j--;
        }
        int tmp = input[i - 1];
        input[i - 1] = input[j];
        input[j] = tmp;

        j = input.length - 1;
        while (i < j) {
            tmp = input[i];
            input[i] = input[j];
            input[j] = tmp;
            i++;
            j--;
        }
        return input;
    }

    static void biggerIsGreater(String w) {
        int input[] = new int[w.length()];
        for (int i = 0; i < w.length(); i++) {
            input[i] = w.charAt(i);
        }
        permutation(input);
        StringBuilder result = new StringBuilder();
        for (int value : input) {
            result.append((char) value);
        }
        if (result.toString().equals(w)) {
            System.out.println("no answer");
        } else {
            System.out.println(result.toString());
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = Integer.parseInt(scanner.nextLine());
        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();
            biggerIsGreater(w);
        }

        scanner.close();
    }
}
