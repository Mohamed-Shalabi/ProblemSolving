package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VanyaAndLanterns {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        tokenizer.nextToken();
        int l = Integer.parseInt(tokenizer.nextToken());
        double[] doubles = Arrays.stream(bufferedReader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Arrays.sort(doubles);
        double max = Math.max(doubles[0], l - doubles[doubles.length - 1]);
        for (int i = 1; i < doubles.length; i++) {
            if (doubles[i] - doubles[i - 1] > 2 * max) {
                max = doubles[i] - doubles[i - 1];
                max /= 2;
            }
        }
        System.out.println(max);
    }
}
