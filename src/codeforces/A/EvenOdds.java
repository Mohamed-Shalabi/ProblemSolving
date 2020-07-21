package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/318/problem/A}
 */
public class EvenOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        long n = Long.parseLong(tokenizer.nextToken());
        long k = Long.parseLong(tokenizer.nextToken());

        if (k <= Math.ceil(n / 2.0)) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println((long) (2 * (k - Math.ceil(n / 2.0))));
        }
    }
}
