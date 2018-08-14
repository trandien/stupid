package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/21/18.
 */
public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        // Complete this function
        int width = 0;
        int temp = 0;

        for (int i = 0; i < word.length(); i++) {
            int ascii = (int) word.charAt(i);
            int height = h[ascii - 97];
            if (height > temp) {
                temp = height;
            }
        }
        return temp * word.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] h = new int[26];
        String[] hItems = scanner.nextLine().split(" ");
        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }
        String word = scanner.nextLine();
        int result = designerPdfViewer(h, word);
        System.out.println(result);

        scanner.close();
    }
}
