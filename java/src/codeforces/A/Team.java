package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/231/problem/A}
 */

public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int out = 0;
        for (int i = 0; i < n; i++) {
            String s = bufferedReader.readLine();
            String[] strings = s.split(" ");
            int num = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]) + Integer.parseInt(strings[2]);
            if (num > 1) {
                out++;
            }
        }
        System.out.println(out);
    }
}
