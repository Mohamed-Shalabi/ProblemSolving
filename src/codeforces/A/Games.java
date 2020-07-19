package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/268/problem/A}
 */
public class Games {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int out = 0;
        int[] a = new int[n], h = new int[n];
        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            a[i] = Integer.parseInt(s[0]);
            h[i] = Integer.parseInt(s[1]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == h[j]) {
                    out++;
                }
            }
        }
        System.out.println(out);
    }
}
