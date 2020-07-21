package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/225/problem/A}
 */
public class DiceTower {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int top1 = Integer.parseInt(bufferedReader.readLine()), top2 = 7 - top1;
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int n1 = Integer.parseInt(tokenizer.nextToken());
            if (n1 == top1 || n1 == top2) {
                System.out.println("NO");
                return;
            }
            n1 = Integer.parseInt(tokenizer.nextToken());
            if (n1 == top1 || n1 == top2) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
