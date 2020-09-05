package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = https://codeforces.com/contest/289/problem/A}
 */
public class PoloThePenguinAndSegments {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int x = 0;
        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            x++;
            int num1 = Integer.parseInt(tokenizer.nextToken());
            int num2 = Integer.parseInt(tokenizer.nextToken());
            x += num2 - num1;
        }
        if (x >= k && x % k == 0) {
            System.out.println(0);
        } else if (k > x) {
            System.out.println(k - x);
        } else {
            System.out.println(k - x % k);
        }
    }
}
