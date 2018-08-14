package study.dymamic_array;

/**
 * Created by dientt on 8/22/17.
 */
public class test {
    public static void main(String[] args) {
        primeLessN(100);
    }

    static void primeLessN(int n) {
        n = n + 1;
        boolean prime []= new boolean[n];
        int j, num;
        prime[0] = prime[1] = false;

        for (num = 2; num < n; num++) {
            if (num > 2 && num % 2 == 0)
                prime[num] = false;
            else
                prime[num] = true;
        }

        num = 3;
        while (num <= n / 2) {
            for (j = num; num * j < n; j++)
                prime[num * j] = false;
            do {
                num += 2;
            } while (!prime[num]);
        }

        for (num = 2; num < n; num++) {
            if (prime[num])
                System.out.println(num);
        }
    }
}
