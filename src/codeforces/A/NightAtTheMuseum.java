package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/731/problem/A}
 */

public class NightAtTheMuseum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        char current;
        char next = 'a';
        char[] chars = bufferedReader.readLine().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            current = next;
            next = chars[i];
            int max = Math.max(current, next);
            int min = Math.min(current, next);
            sum += Math.min(
                    max - min,
                    'z' + 1 - max + min - 'a'
            );
        }
        System.out.println(sum);
    }
}
