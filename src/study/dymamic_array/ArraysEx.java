package study.dymamic_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by dientt on 8/12/17.
 */
public class ArraysEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String arrayLength = br.readLine();
        int nA = Integer.parseInt(arrayLength.split(" ")[0]);
        int nB = Integer.parseInt(arrayLength.split(" ")[1]);
        String chooseNumber = br.readLine();
        int k =  Integer.parseInt(chooseNumber.split(" ")[0]);
        int m =  Integer.parseInt(chooseNumber.split(" ")[1]);

        String arrStr1 = br.readLine();
        String arrStr2 = br.readLine();

        int[] arrayA = Arrays.stream(arrStr1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrayB = Arrays.stream(arrStr2.split(" ")).mapToInt(Integer::parseInt).toArray();

        if(arrayA[k-1] < arrayB[nB-m]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
