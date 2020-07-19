package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * a class to solve the problem {@link = codeforces.com/contest/686/problem/codeforces.A}
 */
public class FreeIceCream {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        Long n = Long.valueOf(strings[0]);
        Long x = Long.valueOf(strings[1]);
        Long distressed = 0L;
        Long left = x;
        for (Integer i = 0; i < n; i++) {
            Long input = Long.valueOf(bufferedReader.readLine().replaceAll(" ", ""));
            if (input > 0) {
                left += input;
            } else {
                if (-input <= left) {
                    left += input;
                } else {
                    distressed++;
                }
            }
        }
        System.out.println(left + " " + distressed);

    }
}
