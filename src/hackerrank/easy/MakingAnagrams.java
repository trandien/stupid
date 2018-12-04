package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 12/4/18.
 */
public class MakingAnagrams {

    static int makingAnagrams(String s1, String s2) {
        int result = 0;
        int arrS1[] = new int[26];
        int arrS2[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arrS1[s1.charAt(i) - 97]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arrS2[s2.charAt(i) - 97]++;
        }

        for(int i=0; i<26; i++) {
            result += Math.abs(arrS1[i] - arrS2[i]);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
        scanner.close();
    }
}
