package study.dymamic_array.ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by dientt on 10/13/17.
 */
public class Chores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line1 = input.nextLine();
        String line2 = input.nextLine();
        int x[] = Stream.of(line1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int y[] = Stream.of(line2.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(y);
        for (int i=0; i<y.length; i++) {
            System.out.println("xxxx: "+y[i]);
        }
        int index = x[2];
        int result = y[index] - y[index-1];
        System.out.println(result);
    }
}
