package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = https://codeforces.com/contest/699/problem/A}
 */
public class LaunchOfCollider {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        char[] chars = bufferedReader.readLine().toCharArray();
        int[] ints = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int time = Integer.MAX_VALUE;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'R' && chars[i + 1] == 'L') {
                if (time > (ints[i + 1] - ints[i]) / 2) {
                    time = (ints[i + 1] - ints[i]) / 2;
                }
            }
        }
        System.out.println(time == Integer.MAX_VALUE ? -1 : time);
    }
}
