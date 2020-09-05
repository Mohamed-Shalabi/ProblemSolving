package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/294/problem/A}
 */
public class ShaassAndOskols {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String[] ais = bufferedReader.readLine().split(" ");
        int[] aisInts = new int[ais.length];
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] xs = new int[n];
        int[] ys = new int[n];
        for (int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split(" ");
            xs[i] = Integer.parseInt(strings[0]);
            ys[i] = Integer.parseInt(strings[1]);
        }
        for (int i = 0; i < ais.length; i++) {
            aisInts[i] = Integer.parseInt(ais[i]);
        }
        for (int i = 0; i < n; i++) {
            try {
                aisInts[xs[i] - 2] += ys[i] - 1;
            } catch (Exception ignored) {
            }
            try {
                aisInts[xs[i]] += aisInts[xs[i] - 1] - ys[i];
            } catch (Exception ignored) {
            }
            aisInts[xs[i] - 1] = 0;
        }
        for (int num : aisInts) {
            System.out.printf("%d ", num);
        }
    }
}
