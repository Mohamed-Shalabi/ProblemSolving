package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/567/submission/86628927}
 */
public class LinelandMail {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] mins = new int[n];
        int[] maxes = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                mins[i] = Math.abs(array[i] - array[i + 1]);
                maxes[i] = Math.abs(array[i] - array[n - 1]);
                continue;
            }
            if (i == n - 1) {
                mins[i] = Math.abs(array[i] - array[n - 2]);
                maxes[i] = Math.abs(array[i] - array[0]);
                continue;
            }
            mins[i] = Math.min(Math.abs(array[i] - array[i + 1]), Math.abs(array[i] - array[i - 1]));
            maxes[i] = Math.max(Math.abs(array[i] - array[0]), Math.abs(array[i] - array[n - 1]));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(mins[i] + " " + maxes[i]);
        }
    }
}
