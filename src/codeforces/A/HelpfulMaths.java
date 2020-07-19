package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 * a class to solve the problem {@link = http://codeforces.com/contest/339/problem/A}
 */
public class HelpfulMaths {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine().replaceAll("\\+", "").toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            System.out.print(Character.getNumericValue(c) + ((i < chars.length - 1)? "+" : ""));
        }
    }
}
