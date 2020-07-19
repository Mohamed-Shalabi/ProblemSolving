package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/768/problem/A}
 * not my answer.
 */
public class OathOfTheNightsWatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String[] input = bufferedReader.readLine().split(" ");
        Arrays.sort(input);
        ArrayList<Integer> strings = new ArrayList<>();
        Arrays.stream(input).forEach(s -> strings.add(Integer.valueOf(s)));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : strings) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        int ans = 0;
        for (int x : strings) {
            if (x < max && x > min) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
