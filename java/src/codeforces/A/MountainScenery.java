package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/218/problem/A}
 */
public class MountainScenery {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int[] ys = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1, j = 0; i < ys.length - 1 && j < k; i++) {
            if (ys[i] > ys[i - 1] + 1 && ys[i] > ys[i + 1] + 1) {
                ys[i] = ys[i] - 1;
                j++;
            }
        }
        for (int y : ys) {
            System.out.print(y + " ");
        }
    }
}
