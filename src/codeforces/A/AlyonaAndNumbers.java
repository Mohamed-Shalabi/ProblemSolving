package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/682/problem/A}
 */
public class AlyonaAndNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        long out = 0;
        if (n < m) {
            n = n + m;
            m = n - m;
            n = n - m;
        }
        out = ((long) n / 5L * (long) m + ((long) n % 5L) * ((long) m / 5L));
        for (int i = 0; i < n % 5; i++) {
            int num = n - i;
            for (int j = 0; j < m % 5; j++) {
                int num2 = m - j;
                if ((num + num2) % 5 == 0) {
                    out++;
                }
            }
        }
        System.out.println(out);
    }
}
