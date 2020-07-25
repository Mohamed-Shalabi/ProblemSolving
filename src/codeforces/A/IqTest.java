package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/287/problem/A}
 */
public class IqTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[][] chars = new char[4][4];
        for (int i = 0; i < 4; i++) {
            chars[i] = bufferedReader.readLine().toCharArray();
        }
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - 1; j++) {
                char[] chars1 = {chars[i][j], chars[i + 1][j], chars[i][j + 1], chars[i + 1][j + 1]};
                Arrays.sort(chars1);
                if (chars1[0] == chars1[1] && chars1[1] == chars1[2]
                        ||
                        chars1[1] == chars1[2] && chars1[2] == chars1[3]) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");

    }
}
