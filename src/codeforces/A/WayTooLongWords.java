package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/71/problem/A}
 */

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            String s = bufferedReader.readLine();
            if (s.length() >= 11) {
                s = s.replaceAll(s.substring(1, s.length() - 1), String.valueOf(s.length() - 2));

            }
            System.out.println(s);
        }
    }
}
