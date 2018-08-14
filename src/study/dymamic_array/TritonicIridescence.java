package study.dymamic_array;

import java.util.Scanner;

/**
 * Created by dientt on 3/31/18.
 */
public class TritonicIridescence {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int n = input.nextInt();
//        String line2 = input.nextLine();
//        if(line2.contains("?")) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

        String dateStr = "2016-01-02";
        String dateStr1 = "2016/01/02";
        String dateStr2 = "01-01-2016";
        String dateStr3 = "2016.01.02";
        String dateStr4 = "04-2016-02";
        System.out.println(getYear(dateStr));
        System.out.println(getYear(dateStr1));
        System.out.println(getYear(dateStr2));
        System.out.println(getYear(dateStr3));
        System.out.println(getYear(dateStr4));
    }

    static int getYear(String dateStr) {
        int result = 0;
        if (dateStr.contains("/")) {
            return parseYear(dateStr, "/");
        } else if (dateStr.contains(".")) {
            return parseYear(dateStr, "\\.");
        } else if (dateStr.contains("-")) {
            return parseYear(dateStr, "-");
        } else if (dateStr.contains("_")) {
            return parseYear(dateStr, "_");
        }
        return result;
    }

    static int parseYear(String dateStr, String splitCharacter) {
        String[] date = dateStr.split(splitCharacter);
        int result = -1;
        try {
            result = Integer.parseInt(date[2]);
            if (result / 1000 > 0) {
                return result;
            }
        } catch (Exception e) {
        }

        try {
            result = Integer.parseInt(date[1]);
            if (result / 1000 > 0) {
                return result;
            }
        } catch (Exception e) {
        }

        try {
            result = Integer.parseInt(date[0]);
            if (result / 1000 > 0) {
                return result;
            }
        } catch (Exception e) {
        }
        return result;
    }
}
