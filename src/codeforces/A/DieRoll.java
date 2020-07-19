package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/9/problem/A}
 */
public class DieRoll {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine().toCharArray();
        int a = Character.getNumericValue(chars[0]);
        int b = Character.getNumericValue(chars[2]);
        int num = 7 - Math.max(a, b);
        int gcd = 1;
        for (int i = num; i > 1; i--) {
            if (num % i == 0 && 6 % i == 0) {
                gcd = i;
                break;
            }
        }
        b = 6 / gcd;
        num = num / gcd;

        System.out.println(num + "/" + b);
    }

}
