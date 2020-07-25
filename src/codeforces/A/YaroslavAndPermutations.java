package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/296/problem/A}
 */
public class YaroslavAndPermutations {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        int[] ints = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (ints.length == 1) {
            System.out.println("YES");
            return;
        }
        Arrays.parallelSort(ints);
        int max = 0;
        int tempMax = 0;
        int current = 0;
        for (int anInt : ints) {
            if (anInt != current) {
                if (tempMax > max) {
                    max = tempMax;
                }
                tempMax = 0;
                current = anInt;
            }
            tempMax++;
        }
        if (tempMax > max) {
            max = tempMax;
        }
        if (max > Math.ceil(((double) ints.length) / 2.0)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
