package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KuriyamaMiraisStones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        long[] a1 = new long[n + 1];
        StringTokenizer tokenizer1 = new StringTokenizer("0" + bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            a1[i] = Long.parseLong(tokenizer1.nextToken());
        }
        long[] a2 = Arrays.copyOf(a1, a1.length);
        long[] s1 = comulateSumArray(a1);
        Arrays.parallelSort(a2);
        long[] s2 = comulateSumArray(a2);
        int m = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < m; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int type = Integer.parseInt(tokenizer.nextToken());
            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());
            if (type == 1) {
                System.out.println(s1[end] - s1[start - 1]);
            } else {
                System.out.println(s2[end + 1] - s2[start]);
            }
        }
    }

    private static long[] comulateSumArray(long[] a) {
        long[] s = new long[a.length + 1];
        for (int i = 1; i < a.length + 1; i++) {
            s[i] = a[i - 1] + s[i - 1];
        }
        return s;
    }
}
