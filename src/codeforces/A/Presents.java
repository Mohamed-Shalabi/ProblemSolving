package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * a class to solve the problem {@link = http://codeforces.com/contest/136/problem/A}
 */
public class Presents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; tokenizer.hasMoreTokens(); i++) {
            arr[Integer.parseInt(tokenizer.nextToken()) - 1] = i + 1;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
