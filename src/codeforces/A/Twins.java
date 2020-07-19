package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/160/problem/A}
 */
public class Twins {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        int[] coins = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int sum1 = 0;
        int sum2 = Arrays.stream(coins).sum();
        for (int i = coins.length - 1; i >= 0; i--) {
            sum1 += coins[i];
            sum2 -= coins[i];
            if (sum1 > sum2) {
                System.out.println(coins.length - i);
                return;
            }
        }
    }
}
