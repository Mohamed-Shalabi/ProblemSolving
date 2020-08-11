package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EffectiveApproach {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] arrayInts = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            arrayInts[num] = i;
        }
        bufferedReader.readLine();
        tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        long vasya = 0;
        long petya = 0;

        while (tokenizer.hasMoreTokens()) {
            int query = Integer.parseInt(tokenizer.nextToken());
            int index = arrayInts[query];
            vasya += index + 1;
            petya += n - index;
        }

        System.out.println(vasya + " " + petya);

    }
}

