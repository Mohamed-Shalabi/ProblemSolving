package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = https://codeforces.com/contest/16/problem/B}
 */
public class BurglarAndMatches {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        Pair[] pairs = new Pair[m];
        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            pairs[i] = new Pair(a, b);
        }
        Arrays.sort(pairs);
        int sum = 0;
        int num = 0;
        loop:
        for (int i = pairs.length - 1; i >= 0; i--) {
            Pair pair = pairs[i];
            for (int j = 0; j < pair.a; j++) {
                sum += pair.b;
                num++;
                if (num == n) {
                    break loop;
                }
            }
        }
        System.out.println(sum);
    }
}

class Pair implements Comparable {

    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Object o) {
        Pair pair = (Pair) o;
        return this.b - pair.b;
    }

//    @Override
//    public String toString() {
//        return a + " " + b + "\n";
//    }
}









