package hackerrank.medium;

import java.util.Scanner;

/**
 * Created by dientt on 5/31/18.
 */
public class TheTimeInWords {

    static String[] container = {"o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    static void timeInWords(int h, int m) {
        String link = "past";
        String minute = null;
        if (m > 30) {
            m = 60 - m;
            h++;
            link = "to";
        }
        String timeFormat = null;
        if (m == 0) {
            System.out.println(container[h] + " " + container[0]);
        } else if (m == 15) {
            minute = "quarter";
            timeFormat = "%s %s %s";
        } else if (m == 30) {
            minute = "half";
            timeFormat = "%s %s %s";
        } else if (m <= 20) {
            minute = container[m];
            if(m == 1) {
                timeFormat = "%s minute %s %s";
            } else {
                timeFormat = "%s minutes %s %s";
            }
        } else {
            minute = container[20] + " " + container[m % 10];
            timeFormat = "%s minutes %s %s";
        }
        if (m != 0) {
            System.out.println(String.format(timeFormat, minute, link, container[h]));
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        timeInWords(h, m);
        scanner.close();
    }
}
