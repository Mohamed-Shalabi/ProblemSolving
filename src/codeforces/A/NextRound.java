package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/158/problem/A}
 */
public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        String[] strings = bufferedReader.readLine().split(" ");
        int j = 0;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(strings[i]);
            if (m > 0) {
                j++;
            }
            if (i >= k - 1 && (i == n - 1 || m != Integer.parseInt(strings[i + 1]))) {
                System.out.println(j);
                return;
            }
        }
        System.out.println(0);
    }
}
