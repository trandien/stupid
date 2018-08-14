package study.dymamic_array.b5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dientt on 8/25/17.
 */
public class AtNightTheMuseum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = 0;
        int previous = 97;
        for(char x : input.toCharArray())  {

            int a = Math.abs((int) x - previous);
            if(a<=13) {
                result += a;
            } else {
                result += Math.abs(26-a);
            }
            previous = (int) x;
        }
        System.out.println(result);
    }
}
