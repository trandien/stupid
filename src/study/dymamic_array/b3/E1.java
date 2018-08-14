package study.dymamic_array.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by dientt on 8/19/17.
 */

// http://www.spoj.com/problems/STPAR/
public class E1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n;
        Deque<Integer> sideStreet = new ArrayDeque<>();
        String result = null;
        while ((n = Integer.parseInt(in.readLine())) != 0) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());
            int street = 1;
            while (n-- > 0) {
                int current = Integer.parseInt(tokenizer.nextToken());
                if (current == street) {
                    street++;
                } else if (sideStreet.peek() == null || sideStreet.peek() > current) {
                    sideStreet.push(current);
                } else if (sideStreet.peek() == street) {
                    do {
                        sideStreet.pop();
                        street++;
                    } while (sideStreet.peek() != null && sideStreet.peek() == street);
                    sideStreet.push(current);
                } else {
                    out.println("no");
                    break;
                }
            }
            if (n < 0) {
                out.println("yes");
            }
            sideStreet.clear();
        }
        out.flush();
    }

}
