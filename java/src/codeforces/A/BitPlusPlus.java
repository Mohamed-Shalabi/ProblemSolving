package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/282/problem/A}
 */
public class BitPlusPlus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = bufferedReader.readLine().toUpperCase();
            if (s.equals("++X") || s.equals("X++")) {
                max++;
            } else {
                max--;
            }
        }
        System.out.println(max);
    }
}
