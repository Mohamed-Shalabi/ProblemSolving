package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/112/problem/A}
 */

public class PetyaAndStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = bufferedReader.readLine().compareToIgnoreCase(bufferedReader.readLine());
        if (i < 0) {
            System.out.println(-1);
        } else if (i > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
