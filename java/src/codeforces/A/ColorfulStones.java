package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/265/problem/A}
 */
public class ColorfulStones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int position = 1;
        char[] chars = bufferedReader.readLine().toCharArray();
        char[] chars1 = bufferedReader.readLine().toCharArray();
        for (char c : chars1) {
            if (chars[position - 1] == c) {
                position++;
            }

        }
        System.out.println(position);

    }

}
