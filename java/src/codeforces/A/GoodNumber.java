package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/365/problem/A}
 */
public class GoodNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int output = n;

        loop:
        for (int i = 0; i < n; i++) {
            char[] chars = bufferedReader.readLine().toCharArray();
            if (chars.length < k + 1) {
                output--;
                continue;
            }
            ArrayList<Integer> ints = new ArrayList<>();
            for (char aChar : chars) {
                ints.add(Character.getNumericValue(aChar));
            }
            ArrayList<Integer> integers = new ArrayList<>();
            ints.stream().distinct().sorted().forEach(integers::add);
            for (int j = 0; j <= k; j++) {
                if (!integers.contains(j)) {
                    output--;
                    continue loop;
                }
            }
        }
        System.out.println(output);
    }
}
