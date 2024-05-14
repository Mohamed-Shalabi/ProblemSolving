package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/709/problem/A}
 */
public class Juicer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int currentSum = 0, out = 0;
        String[] strings = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int maxSize = Integer.parseInt(strings[1]);
        int maxTotalSize = Integer.parseInt(strings[2]);
        strings = bufferedReader.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(strings[i]);
            if (num > maxSize) {
                continue;
            }
            currentSum += num;
            if (currentSum > maxTotalSize) {
                currentSum = 0;
                out++;
            }
        }
        System.out.println(out);
    }
}
