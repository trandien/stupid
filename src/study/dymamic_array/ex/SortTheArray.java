package study.dymamic_array.ex;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by dientt on 10/13/17.
 */
public class SortTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String line2 = input.nextLine();

        int line2Int[] = Stream.of(line2.split(" ")).mapToInt(Integer::parseInt).toArray();


    }
}
