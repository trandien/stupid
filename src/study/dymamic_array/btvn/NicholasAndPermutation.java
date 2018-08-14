package study.dymamic_array.btvn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by dientt on 8/21/17.
 */
public class NicholasAndPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arrStr1 = br.readLine();
        int[] arr = Arrays.stream(arrStr1.split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;

        for(int i=0; i<n; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if(min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        int tem = 0;
        if(maxIndex < minIndex) {
            tem = maxIndex;
            maxIndex = minIndex;
            minIndex = tem;
        }
        int result = Math.max(n-minIndex-1, maxIndex);
        System.out.println(result);
    }
}
