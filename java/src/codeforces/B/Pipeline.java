package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/287/problem/B}
 * NOTE : This solution is not by me.
 */
public class Pipeline {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        long n = Long.parseLong(tokenizer.nextToken());
        long k = Long.parseLong(tokenizer.nextToken());
        if (n == 1) {
            System.out.println(0);
        } else if (k >= n) {
            System.out.println(1);
        } else {
            n -= 1;
            k -= 1;

            if (sum(k) < n) {
                System.out.println(-1);
            } else {
                System.out.println(sumOfPipes(n, k));
            }
        }


    }

    private static long sum(long k) {
        return k * (k + 1) / 2;
    }

    private static long sum(long left, long right) {
        long s = 0;
        if (left <= right) {
            s = sum(right) - sum(left - 1);
        }
        return s;
    }

    private static long sumOfPipes(long n, long k) {

        long left = 1;
        long right = k;

        while (left < right) {
            long mid = (left + right) / 2;
            long s = sum(mid, k);
            if (s == n) {
                return k - mid + 1;
            } else if (s > n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return k - left + 2;
    }
}
