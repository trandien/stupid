package study.dymamic_array.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dientt on 8/19/17.
 */
public class ThrowingCardsAwayI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);
            Queue<Integer> deck = new LinkedList<>();
            for (int i = 1; i <= n; i++) deck.offer(i);

            Queue<Integer> ans = new LinkedList<>();

            while (deck.size() >= 2) {
                ans.offer(deck.poll());
                deck.offer(deck.poll());
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Discarded cards:");
            if (ans.size() > 0) sb.append(" ");
            while (ans.size() > 0) {
                sb.append(ans.poll());
                if (ans.size() > 0) sb.append(", ");
            }
            sb.append("\nRemaining card: ");
            sb.append(deck.poll());
            System.out.println(sb.toString());
        }
    }
}
