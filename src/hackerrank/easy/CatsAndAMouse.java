package hackerrank.easy;

import java.util.Scanner;

/**
 * Created by dientt on 5/20/18.
 */
public class CatsAndAMouse {

    private static final Scanner scanner = new Scanner(System.in);

    static String catAndMouse(int catA, int catB, int mouse) {
        int a = Math.abs(catA - mouse);
        int b = Math.abs(catB - mouse);
        if (a > b) {
            return "Cat B";
        } else if (a < b) {
            return "Cat A";
        }
        return "Mouse C";
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String[] xyz = scanner.nextLine().split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            String result = catAndMouse(x, y, z);
            System.out.println(result);

        }
        scanner.close();
    }
}
