package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 4/7/18.
 */
public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String str) {
        int strLength = str.length();

        String hourType = str.substring(strLength - 2, strLength);
        String hourStr = str.substring(0, 2);
        int hour = Integer.parseInt(hourStr);
        if ("PM".equals(hourType) && hour < 12) {
            hour += 12;
        } else if ("AM".equals(hourType)) {
            if (hour >= 12) {
                hour %= 12;
            }
        }

        String expectedHour = null;
        if (hour < 10) {
            expectedHour = "0" + hour;
        } else {
            expectedHour = hour + "";
        }
        String result = str.substring(0, strLength - 2).replace(hourStr, expectedHour);
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
    }
}
